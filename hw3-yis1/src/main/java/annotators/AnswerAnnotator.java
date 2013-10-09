package annotators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import edu.cmu.deiis.types.Answer;

/**
 * Find Answer in the text and add Answer annotation.
 */
public class AnswerAnnotator extends JCasAnnotator_ImplBase {
  private Pattern QuestionPattern = Pattern.compile("(A).*(.)");

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    //
    Matcher matcher = QuestionPattern.matcher(docText);
    while (matcher.find()) {
      // found one - create annotation
      Answer annotation = new Answer(aJCas);
      annotation.setIsCorrect(matcher.group().substring(2, 3).equals("1"));
      annotation.setBegin(matcher.start() + 4);
      annotation.setEnd(matcher.end());
      annotation.setConfidence(1);
      annotation.setCasProcessorId("AnswerAnnotator");
      annotation.addToIndexes();
    }
  }
}
