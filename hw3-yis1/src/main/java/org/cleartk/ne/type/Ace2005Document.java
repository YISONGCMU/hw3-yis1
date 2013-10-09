

/* First created by JCasGen Tue Oct 08 21:13:06 EDT 2013 */
package org.cleartk.ne.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Tue Oct 08 22:12:36 EDT 2013
 * XML source: C:/Users/sy/git/hw3-yis1/hw3-yis1/src/main/resources/descriptors/AnswerAnnotator.xml
 * @generated */
public class Ace2005Document extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ace2005Document.class);
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
  protected Ace2005Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ace2005Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ace2005Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ace2005Document(JCas jcas, int begin, int end) {
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
  //* Feature: aceSource

  /** getter for aceSource - gets 
   * @generated */
  public String getAceSource() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceSource == null)
      jcasType.jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceSource);}
    
  /** setter for aceSource - sets  
   * @generated */
  public void setAceSource(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceSource == null)
      jcasType.jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceSource, v);}    
   
    
  //*--------------*
  //* Feature: aceUri

  /** getter for aceUri - gets 
   * @generated */
  public String getAceUri() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceUri == null)
      jcasType.jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceUri);}
    
  /** setter for aceUri - sets  
   * @generated */
  public void setAceUri(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceUri == null)
      jcasType.jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceUri, v);}    
   
    
  //*--------------*
  //* Feature: aceType

  /** getter for aceType - gets 
   * @generated */
  public String getAceType() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceType == null)
      jcasType.jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceType);}
    
  /** setter for aceType - sets  
   * @generated */
  public void setAceType(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceType == null)
      jcasType.jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceType, v);}    
  }

    