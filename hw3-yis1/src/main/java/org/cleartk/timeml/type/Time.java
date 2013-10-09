

/* First created by JCasGen Tue Oct 08 21:13:06 EDT 2013 */
package org.cleartk.timeml.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Oct 08 21:13:06 EDT 2013
 * XML source: C:/Users/sy/git/hw3-yis1/hw3-yis1/src/main/resources/CPE-descriptors/Evaluator.xml
 * @generated */
public class Time extends Anchor {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Time.class);
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
  protected Time() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Time(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Time(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Time(JCas jcas, int begin, int end) {
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
  //* Feature: timeType

  /** getter for timeType - gets 
   * @generated */
  public String getTimeType() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_timeType == null)
      jcasType.jcas.throwFeatMissing("timeType", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_timeType);}
    
  /** setter for timeType - sets  
   * @generated */
  public void setTimeType(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_timeType == null)
      jcasType.jcas.throwFeatMissing("timeType", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_timeType, v);}    
   
    
  //*--------------*
  //* Feature: beginPoint

  /** getter for beginPoint - gets 
   * @generated */
  public String getBeginPoint() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_beginPoint == null)
      jcasType.jcas.throwFeatMissing("beginPoint", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_beginPoint);}
    
  /** setter for beginPoint - sets  
   * @generated */
  public void setBeginPoint(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_beginPoint == null)
      jcasType.jcas.throwFeatMissing("beginPoint", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_beginPoint, v);}    
   
    
  //*--------------*
  //* Feature: endPoint

  /** getter for endPoint - gets 
   * @generated */
  public String getEndPoint() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_endPoint);}
    
  /** setter for endPoint - sets  
   * @generated */
  public void setEndPoint(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_endPoint, v);}    
   
    
  //*--------------*
  //* Feature: quant

  /** getter for quant - gets 
   * @generated */
  public String getQuant() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_quant == null)
      jcasType.jcas.throwFeatMissing("quant", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_quant);}
    
  /** setter for quant - sets  
   * @generated */
  public void setQuant(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_quant == null)
      jcasType.jcas.throwFeatMissing("quant", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_quant, v);}    
   
    
  //*--------------*
  //* Feature: freq

  /** getter for freq - gets 
   * @generated */
  public String getFreq() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_freq == null)
      jcasType.jcas.throwFeatMissing("freq", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_freq);}
    
  /** setter for freq - sets  
   * @generated */
  public void setFreq(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_freq == null)
      jcasType.jcas.throwFeatMissing("freq", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_freq, v);}    
   
    
  //*--------------*
  //* Feature: functionInDocument

  /** getter for functionInDocument - gets 
   * @generated */
  public String getFunctionInDocument() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_functionInDocument == null)
      jcasType.jcas.throwFeatMissing("functionInDocument", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_functionInDocument);}
    
  /** setter for functionInDocument - sets  
   * @generated */
  public void setFunctionInDocument(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_functionInDocument == null)
      jcasType.jcas.throwFeatMissing("functionInDocument", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_functionInDocument, v);}    
   
    
  //*--------------*
  //* Feature: temporalFunction

  /** getter for temporalFunction - gets 
   * @generated */
  public String getTemporalFunction() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_temporalFunction == null)
      jcasType.jcas.throwFeatMissing("temporalFunction", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_temporalFunction);}
    
  /** setter for temporalFunction - sets  
   * @generated */
  public void setTemporalFunction(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_temporalFunction == null)
      jcasType.jcas.throwFeatMissing("temporalFunction", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_temporalFunction, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated */
  public String getValue() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated */
  public void setValue(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: valueFromFunction

  /** getter for valueFromFunction - gets 
   * @generated */
  public String getValueFromFunction() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_valueFromFunction == null)
      jcasType.jcas.throwFeatMissing("valueFromFunction", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_valueFromFunction);}
    
  /** setter for valueFromFunction - sets  
   * @generated */
  public void setValueFromFunction(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_valueFromFunction == null)
      jcasType.jcas.throwFeatMissing("valueFromFunction", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_valueFromFunction, v);}    
   
    
  //*--------------*
  //* Feature: mod

  /** getter for mod - gets 
   * @generated */
  public String getMod() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.cleartk.timeml.type.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_mod);}
    
  /** setter for mod - sets  
   * @generated */
  public void setMod(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_mod, v);}    
   
    
  //*--------------*
  //* Feature: anchorTime

  /** getter for anchorTime - gets 
   * @generated */
  public Time getAnchorTime() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_anchorTime == null)
      jcasType.jcas.throwFeatMissing("anchorTime", "org.cleartk.timeml.type.Time");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Time_Type)jcasType).casFeatCode_anchorTime)));}
    
  /** setter for anchorTime - sets  
   * @generated */
  public void setAnchorTime(Time v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_anchorTime == null)
      jcasType.jcas.throwFeatMissing("anchorTime", "org.cleartk.timeml.type.Time");
    jcasType.ll_cas.ll_setRefValue(addr, ((Time_Type)jcasType).casFeatCode_anchorTime, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    