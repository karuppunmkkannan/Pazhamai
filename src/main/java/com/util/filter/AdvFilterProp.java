package com.util.filter;

/**
*
* @author SBirmani
*/
public class AdvFilterProp {
   private String uiTableHeader;
   private String objName;
   private String objAttrName;
   private String refObjName;
   private String refObjAttrName;
   private String refObjPk;
   private String masterType;

   public AdvFilterProp(String uiTableHeader, String objName, String objAttrName, String refObjName, String refObjAttrName,String refObjPk ,String masterType) {
       this.uiTableHeader = uiTableHeader;
       this.objName = objName;
       this.objAttrName = objAttrName;
       this.refObjName = refObjName;
       this.refObjAttrName = refObjAttrName;
       this.refObjPk = refObjPk;
       this.masterType = masterType;
   }
   public String getUiTableHeader() {
       return uiTableHeader;
   }

   public void setUiTableHeader(String uiTableHeader) {
       this.uiTableHeader = uiTableHeader;
   }

   public String getObjName() {
       return objName;
   }

   public void setObjName(String objName) {
       this.objName = objName;
   }

   public String getObjAttrName() {
       return objAttrName;
   }

   public void setObjAttrName(String objAttrName) {
       this.objAttrName = objAttrName;
   }

   public String getRefObjName() {
       return refObjName;
   }

   public void setRefObjName(String refObjName) {
       this.refObjName = refObjName;
   }

   public String getRefObjAttrName() {
       return refObjAttrName;
   }

   public void setRefObjAttrName(String refObjAttrName) {
       this.refObjAttrName = refObjAttrName;
   }

   public String getMasterType() {
       return masterType;
   }

   public void setMasterType(String masterType) {
       this.masterType = masterType;
   }

    public String getRefObjPk() {
        return refObjPk;
    }

    public void setRefObjPk(String refObjPk) {
        this.refObjPk = refObjPk;
    }
   
}