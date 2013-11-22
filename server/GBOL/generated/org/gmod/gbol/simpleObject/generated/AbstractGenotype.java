package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * Genotype generated by hbm2java
 */
public abstract class AbstractGenotype extends AbstractSimpleObject implements java.io.Serializable {


     private Integer genotypeId;
     private String name;
     private String uniqueName;
     private String description;
     private Set<FeatureGenotype> featureGenotypes = new HashSet<FeatureGenotype>(0);
     private Set<PhenotypeStatement> phenotypeStatements = new HashSet<PhenotypeStatement>(0);
     private Set<PhenotypeDescription> phenotypeDescriptions = new HashSet<PhenotypeDescription>(0);

    public AbstractGenotype() {
    }

	
    public AbstractGenotype(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    public AbstractGenotype(String name, String uniqueName, String description, Set<FeatureGenotype> featureGenotypes, Set<PhenotypeStatement> phenotypeStatements, Set<PhenotypeDescription> phenotypeDescriptions) {
       this.name = name;
       this.uniqueName = uniqueName;
       this.description = description;
       this.featureGenotypes = featureGenotypes;
       this.phenotypeStatements = phenotypeStatements;
       this.phenotypeDescriptions = phenotypeDescriptions;
    }
   
    public Integer getGenotypeId() {
        return this.genotypeId;
    }
    
    public void setGenotypeId(Integer genotypeId) {
        this.genotypeId = genotypeId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUniqueName() {
        return this.uniqueName;
    }
    
    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<FeatureGenotype> getFeatureGenotypes() {
        return this.featureGenotypes;
    }
    
    public void setFeatureGenotypes(Set<FeatureGenotype> featureGenotypes) {
        this.featureGenotypes = featureGenotypes;
    }
    public Set<PhenotypeStatement> getPhenotypeStatements() {
        return this.phenotypeStatements;
    }
    
    public void setPhenotypeStatements(Set<PhenotypeStatement> phenotypeStatements) {
        this.phenotypeStatements = phenotypeStatements;
    }
    public Set<PhenotypeDescription> getPhenotypeDescriptions() {
        return this.phenotypeDescriptions;
    }
    
    public void setPhenotypeDescriptions(Set<PhenotypeDescription> phenotypeDescriptions) {
        this.phenotypeDescriptions = phenotypeDescriptions;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractGenotype) ) return false;
		 AbstractGenotype castOther = ( AbstractGenotype ) other; 
         
		 return ( (this.getUniqueName()==castOther.getUniqueName()) || ( this.getUniqueName()!=null && castOther.getUniqueName()!=null && this.getUniqueName().equals(castOther.getUniqueName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getUniqueName() == null ? 0 : this.getUniqueName().hashCode() );
         
         
         
         
         return result;
   }   

public AbstractGenotype generateClone() {
	AbstractGenotype cloned = new AbstractGenotype; 
    	   cloned.name = this.name;
    	   cloned.uniqueName = this.uniqueName;
    	   cloned.description = this.description;
    	   cloned.featureGenotypes = this.featureGenotypes;
    	   cloned.phenotypeStatements = this.phenotypeStatements;
    	   cloned.phenotypeDescriptions = this.phenotypeDescriptions;
	return cloned;
}


}


