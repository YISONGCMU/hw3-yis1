

/* First created by JCasGen Tue Oct 08 21:13:06 EDT 2013 */
package org.cleartk.syntax.dependency.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredTOP;


/** 
 * Updated by JCasGen Tue Oct 08 21:13:06 EDT 2013
 * XML source: C:/Users/sy/git/hw3-yis1/hw3-yis1/src/main/resources/CPE-descriptors/Evaluator.xml
 * @generated */
public class DependencyRelation extends ScoredTOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DependencyRelation.class);
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
  protected DependencyRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DependencyRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DependencyRelation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Head

  /** getter for Head - gets 
   * @generated */
  public DependencyNode getHead() {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Head == null)
      jcasType.jcas.throwFeatMissing("Head", "org.cleartk.syntax.dependency.type.DependencyRelation");
    return (DependencyNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Head)));}
    
  /** setter for Head - sets  
   * @generated */
  public void setHead(DependencyNode v) {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Head == null)
      jcasType.jcas.throwFeatMissing("Head", "org.cleartk.syntax.dependency.type.DependencyRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Head, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Relation

  /** getter for Relation - gets 
   * @generated */
  public String getRelation() {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Relation == null)
      jcasType.jcas.throwFeatMissing("Relation", "org.cleartk.syntax.dependency.type.DependencyRelation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Relation);}
    
  /** setter for Relation - sets  
   * @generated */
  public void setRelation(String v) {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Relation == null)
      jcasType.jcas.throwFeatMissing("Relation", "org.cleartk.syntax.dependency.type.DependencyRelation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Relation, v);}    
   
    
  //*--------------*
  //* Feature: Child

  /** getter for Child - gets 
   * @generated */
  public DependencyNode getChild() {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Child == null)
      jcasType.jcas.throwFeatMissing("Child", "org.cleartk.syntax.dependency.type.DependencyRelation");
    return (DependencyNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Child)));}
    
  /** setter for Child - sets  
   * @generated */
  public void setChild(DependencyNode v) {
    if (DependencyRelation_Type.featOkTst && ((DependencyRelation_Type)jcasType).casFeat_Child == null)
      jcasType.jcas.throwFeatMissing("Child", "org.cleartk.syntax.dependency.type.DependencyRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DependencyRelation_Type)jcasType).casFeatCode_Child, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    