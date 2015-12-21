package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IntermediateId generated by hbm2java
 */
@Embeddable
public class IntermediateId  implements java.io.Serializable {


     private String interKey;
     private String uuid;

    public IntermediateId() {
    }

    public IntermediateId(String interKey, String uuid) {
       this.interKey = interKey;
       this.uuid = uuid;
    }
   

    @Column(name="INTER_KEY", nullable=false, length=128)
    public String getInterKey() {
        return this.interKey;
    }
    
    public void setInterKey(String interKey) {
        this.interKey = interKey;
    }

    @Column(name="UUID", nullable=false, length=64)
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IntermediateId) ) return false;
		 IntermediateId castOther = ( IntermediateId ) other; 
         
		 return ( (this.getInterKey()==castOther.getInterKey()) || ( this.getInterKey()!=null && castOther.getInterKey()!=null && this.getInterKey().equals(castOther.getInterKey()) ) )
 && ( (this.getUuid()==castOther.getUuid()) || ( this.getUuid()!=null && castOther.getUuid()!=null && this.getUuid().equals(castOther.getUuid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInterKey() == null ? 0 : this.getInterKey().hashCode() );
         result = 37 * result + ( getUuid() == null ? 0 : this.getUuid().hashCode() );
         return result;
   }   


}

