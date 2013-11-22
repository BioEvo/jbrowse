package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * CVTermRelationship generated by hbm2java
 */
public abstract class AbstractCVTermRelationship extends AbstractSimpleObject implements java.io.Serializable {


     private Integer cvtermRelationshipId;
     private CVTerm subjectCVTerm;
     private CVTerm objectCVTerm;
     private CVTerm type;

    public AbstractCVTermRelationship() {
    }

    public AbstractCVTermRelationship(CVTerm subjectCVTerm, CVTerm objectCVTerm, CVTerm type) {
       this.subjectCVTerm = subjectCVTerm;
       this.objectCVTerm = objectCVTerm;
       this.type = type;
    }
   
    public Integer getCvtermRelationshipId() {
        return this.cvtermRelationshipId;
    }
    
    public void setCvtermRelationshipId(Integer cvtermRelationshipId) {
        this.cvtermRelationshipId = cvtermRelationshipId;
    }
    public CVTerm getSubjectCVTerm() {
        return this.subjectCVTerm;
    }
    
    public void setSubjectCVTerm(CVTerm subjectCVTerm) {
        this.subjectCVTerm = subjectCVTerm;
    }
    public CVTerm getObjectCVTerm() {
        return this.objectCVTerm;
    }
    
    public void setObjectCVTerm(CVTerm objectCVTerm) {
        this.objectCVTerm = objectCVTerm;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractCVTermRelationship) ) return false;
		 AbstractCVTermRelationship castOther = ( AbstractCVTermRelationship ) other; 
         
		 return ( (this.getSubjectCVTerm()==castOther.getSubjectCVTerm()) || ( this.getSubjectCVTerm()!=null && castOther.getSubjectCVTerm()!=null && this.getSubjectCVTerm().equals(castOther.getSubjectCVTerm()) ) )
 && ( (this.getObjectCVTerm()==castOther.getObjectCVTerm()) || ( this.getObjectCVTerm()!=null && castOther.getObjectCVTerm()!=null && this.getObjectCVTerm().equals(castOther.getObjectCVTerm()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getSubjectCVTerm() == null ? 0 : this.getSubjectCVTerm().hashCode() );
         result = 37 * result + ( getObjectCVTerm() == null ? 0 : this.getObjectCVTerm().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         return result;
   }   

public AbstractCVTermRelationship generateClone() {
	AbstractCVTermRelationship cloned = new AbstractCVTermRelationship; 
    	   cloned.subjectCVTerm = this.subjectCVTerm;
    	   cloned.objectCVTerm = this.objectCVTerm;
    	   cloned.type = this.type;
	return cloned;
}


}


