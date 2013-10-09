package annotators;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import edu.cmu.deiis.types.*;

/**
 * Print the Answer ordered by score and calculate the Precision.
 */
public class EvaluationAnnotator extends JCasAnnotator_ImplBase {
  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  private Pattern QuestionPattern = Pattern.compile("(Q).*(?)");

  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();

    FSIndex AnswerScoreIndex = aJCas.getAnnotationIndex(AnswerScore.type);
    Iterator AnswerScoreIter = AnswerScoreIndex.iterator();

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