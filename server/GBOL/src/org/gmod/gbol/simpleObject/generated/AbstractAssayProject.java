package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * AssayProject generated by hbm2java
 */
public abstract class AbstractAssayProject extends AbstractSimpleObject implements java.io.Serializable {


     private Integer assayProjectId;
     private Assay assay;
     private Project project;

    public AbstractAssayProject() {
    }

    public AbstractAssayProject(Assay assay, Project project) {
       this.assay = assay;
       this.project = project;
    }
   
    public Integer getAssayProjectId() {
        return this.assayProjectId;
    }
    
    public void setAssayProjectId(Integer assayProjectId) {
        this.assayProjectId = assayProjectId;
    }
    public Assay getAssay() {
        return this.assay;
    }
    
    public void setAssay(Assay assay) {
        this.assay = assay;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractAssayProject) ) return false;
		 AbstractAssayProject castOther = ( AbstractAssayProject ) other; 
         
		 return ( (this.getAssay()==castOther.getAssay()) || ( this.getAssay()!=null && castOther.getAssay()!=null && this.getAssay().equals(castOther.getAssay()) ) )
 && ( (this.getProject()==castOther.getProject()) || ( this.getProject()!=null && castOther.getProject()!=null && this.getProject().equals(castOther.getProject()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getAssay() == null ? 0 : this.getAssay().hashCode() );
         result = 37 * result + ( getProject() == null ? 0 : this.getProject().hashCode() );
         return result;
   }   

public AbstractAssayProject generateClone() {
	AbstractAssayProject cloned = new AssayProject(); 
    	   cloned.assay = this.assay;
    	   cloned.project = this.project;
	return cloned;
}


}


