package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * ArrayDesign generated by hbm2java
 */
public abstract class AbstractArrayDesign extends AbstractSimpleObject implements java.io.Serializable {


     private Integer arrayDesignId;
     private String version;
     private CVTerm platformType;
     private Contact manufacturer;
     private DBXref dbxref;
     private Protocol protocol;
     private CVTerm substrateType;
     private String name;
     private String description;
     private String arrayDimensions;
     private String elementDimensions;
     private Integer numberOfElements;
     private Integer numberOfArrayColumns;
     private Integer numberOfArrayRows;
     private Integer numberOfGridColumns;
     private Integer numberOfGridRows;
     private Integer numberOfSubColumns;
     private Integer numberOfSubRows;
     private Set<Assay> assays = new HashSet<Assay>(0);
     private Set<Element> elements = new HashSet<Element>(0);
     private Set<ArrayDesignProperty> arrayDesignProperties = new HashSet<ArrayDesignProperty>(0);

    public AbstractArrayDesign() {
    }

	
    public AbstractArrayDesign(CVTerm platformType, Contact manufacturer, String name) {
        this.platformType = platformType;
        this.manufacturer = manufacturer;
        this.name = name;
    }
    public AbstractArrayDesign(CVTerm platformType, Contact manufacturer, DBXref dbxref, Protocol protocol, CVTerm substrateType, String name, String description, String arrayDimensions, String elementDimensions, Integer numberOfElements, Integer numberOfArrayColumns, Integer numberOfArrayRows, Integer numberOfGridColumns, Integer numberOfGridRows, Integer numberOfSubColumns, Integer numberOfSubRows, Set<Assay> assays, Set<Element> elements, Set<ArrayDesignProperty> arrayDesignProperties) {
       this.platformType = platformType;
       this.manufacturer = manufacturer;
       this.dbxref = dbxref;
       this.protocol = protocol;
       this.substrateType = substrateType;
       this.name = name;
       this.description = description;
       this.arrayDimensions = arrayDimensions;
       this.elementDimensions = elementDimensions;
       this.numberOfElements = numberOfElements;
       this.numberOfArrayColumns = numberOfArrayColumns;
       this.numberOfArrayRows = numberOfArrayRows;
       this.numberOfGridColumns = numberOfGridColumns;
       this.numberOfGridRows = numberOfGridRows;
       this.numberOfSubColumns = numberOfSubColumns;
       this.numberOfSubRows = numberOfSubRows;
       this.assays = assays;
       this.elements = elements;
       this.arrayDesignProperties = arrayDesignProperties;
    }
   
    public Integer getArrayDesignId() {
        return this.arrayDesignId;
    }
    
    public void setArrayDesignId(Integer arrayDesignId) {
        this.arrayDesignId = arrayDesignId;
    }
    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    public CVTerm getPlatformType() {
        return this.platformType;
    }
    
    public void setPlatformType(CVTerm platformType) {
        this.platformType = platformType;
    }
    public Contact getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(Contact manufacturer) {
        this.manufacturer = manufacturer;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public Protocol getProtocol() {
        return this.protocol;
    }
    
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
    public CVTerm getSubstrateType() {
        return this.substrateType;
    }
    
    public void setSubstrateType(CVTerm substrateType) {
        this.substrateType = substrateType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getArrayDimensions() {
        return this.arrayDimensions;
    }
    
    public void setArrayDimensions(String arrayDimensions) {
        this.arrayDimensions = arrayDimensions;
    }
    public String getElementDimensions() {
        return this.elementDimensions;
    }
    
    public void setElementDimensions(String elementDimensions) {
        this.elementDimensions = elementDimensions;
    }
    public Integer getNumberOfElements() {
        return this.numberOfElements;
    }
    
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
    public Integer getNumberOfArrayColumns() {
        return this.numberOfArrayColumns;
    }
    
    public void setNumberOfArrayColumns(Integer numberOfArrayColumns) {
        this.numberOfArrayColumns = numberOfArrayColumns;
    }
    public Integer getNumberOfArrayRows() {
        return this.numberOfArrayRows;
    }
    
    public void setNumberOfArrayRows(Integer numberOfArrayRows) {
        this.numberOfArrayRows = numberOfArrayRows;
    }
    public Integer getNumberOfGridColumns() {
        return this.numberOfGridColumns;
    }
    
    public void setNumberOfGridColumns(Integer numberOfGridColumns) {
        this.numberOfGridColumns = numberOfGridColumns;
    }
    public Integer getNumberOfGridRows() {
        return this.numberOfGridRows;
    }
    
    public void setNumberOfGridRows(Integer numberOfGridRows) {
        this.numberOfGridRows = numberOfGridRows;
    }
    public Integer getNumberOfSubColumns() {
        return this.numberOfSubColumns;
    }
    
    public void setNumberOfSubColumns(Integer numberOfSubColumns) {
        this.numberOfSubColumns = numberOfSubColumns;
    }
    public Integer getNumberOfSubRows() {
        return this.numberOfSubRows;
    }
    
    public void setNumberOfSubRows(Integer numberOfSubRows) {
        this.numberOfSubRows = numberOfSubRows;
    }
    public Set<Assay> getAssays() {
        return this.assays;
    }
    
    public void setAssays(Set<Assay> assays) {
        this.assays = assays;
    }
    public Set<Element> getElements() {
        return this.elements;
    }
    
    public void setElements(Set<Element> elements) {
        this.elements = elements;
    }
    public Set<ArrayDesignProperty> getArrayDesignProperties() {
        return this.arrayDesignProperties;
    }
    
    public void setArrayDesignProperties(Set<ArrayDesignProperty> arrayDesignProperties) {
        this.arrayDesignProperties = arrayDesignProperties;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractArrayDesign) ) return false;
		 AbstractArrayDesign castOther = ( AbstractArrayDesign ) other; 
         
		 return ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         
         
         
         
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         
         
         
         
         
         
         
         
         
         
         
         
         return result;
   }   

public AbstractArrayDesign generateClone() {
	AbstractArrayDesign cloned = new AbstractArrayDesign; 
    	   cloned.platformType = this.platformType;
    	   cloned.manufacturer = this.manufacturer;
    	   cloned.dbxref = this.dbxref;
    	   cloned.protocol = this.protocol;
    	   cloned.substrateType = this.substrateType;
    	   cloned.name = this.name;
    	   cloned.description = this.description;
    	   cloned.arrayDimensions = this.arrayDimensions;
    	   cloned.elementDimensions = this.elementDimensions;
    	   cloned.numberOfElements = this.numberOfElements;
    	   cloned.numberOfArrayColumns = this.numberOfArrayColumns;
    	   cloned.numberOfArrayRows = this.numberOfArrayRows;
    	   cloned.numberOfGridColumns = this.numberOfGridColumns;
    	   cloned.numberOfGridRows = this.numberOfGridRows;
    	   cloned.numberOfSubColumns = this.numberOfSubColumns;
    	   cloned.numberOfSubRows = this.numberOfSubRows;
    	   cloned.assays = this.assays;
    	   cloned.elements = this.elements;
    	   cloned.arrayDesignProperties = this.arrayDesignProperties;
	return cloned;
}


}


