

/* First created by JCasGen Tue Oct 08 21:13:06 EDT 2013 */
package org.cleartk.timeml.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Tue Oct 08 21:13:06 EDT 2013
 * XML source: C:/Users/sy/git/hw3-yis1/hw3-yis1/src/main/resources/CPE-descriptors/Evaluator.xml
 * @generated */
public class TemporalLink extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TemporalLink.class);
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
  protected TemporalLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TemporalLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TemporalLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TemporalLink(JCas jcas, int begin, int end) {
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
  //* Feature: relationType

  /** getter for relationType - gets 
   * @generated */
  public String getRelationType() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_relationType);}
    
  /** setter for relationType - sets  
   * @generated */
  public void setRelationType(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_relationType, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public Anchor getSource() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    return (Anchor)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(Anchor v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated */
  public Anchor getTarget() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    return (Anchor)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated */
  public void setTarget(Anchor v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: signalID

  /** getter for signalID - gets 
   * @generated */
  public String getSignalID() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_signalID);}
    
  /** setter for signalID - sets  
   * @generated */
  public void setSignalID(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_signalID, v);}    
  }

    