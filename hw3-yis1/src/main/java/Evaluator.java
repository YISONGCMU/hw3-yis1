import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.resource.ResourceProcessException;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;
import org.cleartk.*;
import org.cleartk.ne.type.NamedEntity;
import org.cleartk.ne.type.NamedEntityMention;
import org.cleartk.token.type.Token_Type;

import edu.cmu.deiis.types.*;

public class Evaluator extends CasConsumer_ImplBase {

  private Pattern QuestionPattern = Pattern.compile("(Q).*(?)");
  public void processCas(CAS aCAS) throws ResourceProcessException {

    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    
    

    // get document text
    String docText = jcas.getDocumentText();

    FSIndex AnswerScoreIndex = jcas.getAnnotationIndex(AnswerScore.type);
    Iterator AnswerScoreIter = AnswerScoreIndex.iterator();

   /* FSIndex TokenIndex = jcas.getAnnotationIndex(org.cleartk.token.type.Token.type);
    Iterator TokenIter = TokenIndex.iterator();
    for (int i=0; i<TokenIndex.size();i++)
      System.out.println(((Token) TokenIter.next()));
    */
    jcas.getDocumentAnnotationFs();
    
   
    FSIndex nameEntityIndex = jcas.getAnnotationIndex(NamedEntityMention.type);

    // Iterator to get each sentence annotation
    Iterator nameEntityIter = nameEntityIndex.iterator();
    
    while (nameEntityIter.hasNext()) {
      NamedEntityMention namedEntity = (NamedEntityMention) nameEntityIter.next();
      
      String CoveredText = namedEntity.getCoveredText();
     
      System.out.println(CoveredText);
      
      
    }
   
  
    
    
    Matcher Qmatcher = QuestionPattern.matcher(docText);
    if (Qmatcher.find())
      System.out.println("Question: " + Qmatcher.group());

    // get the question NGram
    AnswerScore[] AnswerArray = new AnswerScore[AnswerScoreIndex.size()];
    for (int i = 0; i < AnswerScoreIndex.size(); i++)
      AnswerArray[i] = (AnswerScore) AnswerScoreIter.next();

    for (int i = 0; i < AnswerScoreIndex.size(); i++) {
      for (int j = i + 1; j < AnswerScoreIndex.size(); j++) {
        if (AnswerArray[i].getScore() < AnswerArray[j].getScore()) {
          AnswerScore Exchange = AnswerArray[i];
          AnswerArray[i] = AnswerArray[j];
          AnswerArray[j] = Exchange;
        }
      }
    }
    int N = 0;
    int TrueNumber = 0;
    for (int i = 0; i < AnswerScoreIndex.size(); i++) {
      if (AnswerArray[i].getAnswer().getIsCorrect())
        N++;
      if (AnswerArray[i].getAnswer().getIsCorrect())
        System.out.print("+ ");
      else
        System.out.print("- ");
      System.out.println(" " + String.format("%.2f", AnswerArray[i].getScore()) + " "
              + docText.substring(AnswerArray[i].getBegin(), AnswerArray[i].getEnd()));
    }
    for (int i = 0; i < N; i++) {
      if (AnswerArray[i].getAnswer().getIsCorrect())
        TrueNumber++;
    }
    System.out.println("Precision at " + N + ": "
            + String.format("%.2f", ((double) TrueNumber / N)));
    
   
  }

}
