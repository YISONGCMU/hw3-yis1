

/* First created by JCasGen Tue Oct 08 21:13:06 EDT 2013 */
package org.cleartk.syntax.constituent.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Oct 08 22:12:36 EDT 2013
 * XML source: C:/Users/sy/git/hw3-yis1/hw3-yis1/src/main/resources/descriptors/AnswerAnnotator.xml
 * @generated */
public class TerminalTreebankNode extends TreebankNode {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TerminalTreebankNode.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TerminalTreebankNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TerminalTreebankNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TerminalTreebankNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TerminalTreebankNode(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets This value is the same as the index of this node in the top nodes list of terminals.
   * @generated */
  public int getIndex() {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.cleartk.syntax.constituent.type.TerminalTreebankNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets This value is the same as the index of this node in the top nodes list of terminals. 
   * @generated */
  public void setIndex(int v) {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.cleartk.syntax.constituent.type.TerminalTreebankNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_index, v);}    
   
    
  //*--------------*
  //* Feature: tokenIndex

  /** getter for tokenIndex - gets The value of this corresponds to the nth token in the sentence that this terminal corresponds to.  The value -1 means that this terminal does not correspond to a token (because it is a trace.)  We assume that each token corresponds to a terminal.
   * @generated */
  public int getTokenIndex() {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_tokenIndex == null)
      jcasType.jcas.throwFeatMissing("tokenIndex", "org.cleartk.syntax.constituent.type.TerminalTreebankNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_tokenIndex);}
    
  /** setter for tokenIndex - sets The value of this corresponds to the nth token in the sentence that this terminal corresponds to.  The value -1 means that this terminal does not correspond to a token (because it is a trace.)  We assume that each token corresponds to a terminal. 
   * @generated */
  public void setTokenIndex(int v) {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_tokenIndex == null)
      jcasType.jcas.throwFeatMissing("tokenIndex", "org.cleartk.syntax.constituent.type.TerminalTreebankNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_tokenIndex, v);}    
  }

    