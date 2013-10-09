package annotators;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.tutorial.TimeAnnot;

import edu.cmu.deiis.types.*;

/**
 * Find Answer line and, calculate the score and add Answer Score annotation.
 */
public class AnswerScoreAnnotator extends JCasAnnotator_ImplBase {
  private Pattern AnswerPattern = Pattern.compile("(A).*(.)");

  private Pattern QuestionPattern = Pattern.compile("(Q).*(?)");

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    // search for AnswerScore
    Matcher matcher = AnswerPattern.matcher(docText);
    Matcher Qmatcher = QuestionPattern.matcher(docText);

    FSIndex AnswerIndex = aJCas.getAnnotationIndex(Answer.type);

    FSIndex NGramIndex = aJCas.getAnnotationIndex(NGram.type);
    FSIndex QNGramIndex = aJCas.getAnnotationIndex(NGram.type);

    Iterator QNGramIter = QNGramIndex.iterator();
    Iterator NGramIter = NGramIndex.iterator();

    Iterator AnswerIter = AnswerIndex.iterator();
    int Qend = 0;
    if (Qmatcher.find())
      Qend = Qmatcher.end();

    // get the question NGram
    NGram[] Qarray = new NGram[QNGramIndex.size()];

    int QN = 0;
    while (QNGramIter.hasNext()) {
      NGram A = (NGram) QNGramIter.next();
      if (A.getEnd() <= Qend) {
        QN = QN + 1;
        ;
        Qarray[QN] = A;

      }
    }

    while (matcher.find()) {
      // found one answer - create answerscore annotation
      AnswerScore annotation = new AnswerScore(aJCas);
      annotation.setBegin(matcher.start() + 4);
      annotation.setEnd(matcher.end());
      annotation.setConfidence(1);
      annotation.setCasProcessorId("AnswerScoreAnnotator");
      annotation.setAnswer((Answer) AnswerIter.next());
      int Match = 0;

      boolean j = true;
      int GramNumber = 0;
      // get the number(Match) of the answer NGrams which match the question NGram
      for (int i = 0; i < QN; i++) {

        NGramIter = NGramIndex.iterator();
        while (NGramIter.hasNext())

        {
          NGram A = (NGram) NGramIter.next();

          if ((A.getBegin() >= matcher.start()) && (A.getEnd() <= matcher.end())) {

            if (j) {
              GramNumber = GramNumber + 1;
            }

            if (docText.substring(Qarray[i + 1].getBegin(), Qarray[i + 1].getEnd()).equals(
                    docText.substring(A.getBegin(), A.getEnd())))
              Match = Match + 1;

          }

        }
        if (GramNumber != 0)
          j = false;

      }
      // GramNumber is the number of NGrams of this answer.
      annotation.setScore((double) Match / (GramNumber));
      annotation.addToIndexes();
    }
  }
}
