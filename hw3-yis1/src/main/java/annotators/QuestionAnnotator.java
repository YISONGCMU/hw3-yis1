package annotators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import edu.cmu.deiis.types.Question;

/**
 * Find Question and add question annotation.
 */
public class QuestionAnnotator extends JCasAnnotator_ImplBase {
  private Pattern QuestionPattern = Pattern.compile("(Q).*(?)");

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    // search for Question
    Matcher matcher = QuestionPattern.matcher(docText);
    while (matcher.find()) {
      // found one - create Question annotation
      Question annotation = new Question(aJCas);
      annotation.setBegin(matcher.start() + 2);
      annotation.setEnd(matcher.end());
      annotation.setConfidence(1);
      annotation.setCasProcessorId("QuestionAnnotator");
      annotation.addToIndexes();
    }

  }
}
