/**
 * AddressOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class AddressOptions  implements java.io.Serializable {
    private int matchType;

    private boolean usePhonetic;

    private int searchType;

    private br.com.maplink2.webservices.ResultRange resultRange;

    public AddressOptions() {
    }

    public AddressOptions(
           int matchType,
           boolean usePhonetic,
           int searchType,
           br.com.maplink2.webservices.ResultRange resultRange) {
           this.matchType = matchType;
           this.usePhonetic = usePhonetic;
           this.searchType = searchType;
           this.resultRange = resultRange;
    }


    /**
     * Gets the matchType value for this AddressOptions.
     * 
     * @return matchType
     */
    public int getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this AddressOptions.
     * 
     * @param matchType
     */
    public void setMatchType(int matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the usePhonetic value for this AddressOptions.
     * 
     * @return usePhonetic
     */
    public boolean isUsePhonetic() {
        return usePhonetic;
    }


    /**
     * Sets the usePhonetic value for this AddressOptions.
     * 
     * @param usePhonetic
     */
    public void setUsePhonetic(boolean usePhonetic) {
        this.usePhonetic = usePhonetic;
    }


    /**
     * Gets the searchType value for this AddressOptions.
     * 
     * @return searchType
     */
    public int getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this AddressOptions.
     * 
     * @param searchType
     */
    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the resultRange value for this AddressOptions.
     * 
     * @return resultRange
     */
    public br.com.maplink2.webservices.ResultRange getResultRange() {
        return resultRange;
    }


    /**
     * Sets the resultRange value for this AddressOptions.
     * 
     * @param resultRange
     */
    public void setResultRange(br.com.maplink2.webservices.ResultRange resultRange) {
        this.resultRange = resultRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressOptions)) return false;
        AddressOptions other = (AddressOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.matchType == other.getMatchType() &&
            this.usePhonetic == other.isUsePhonetic() &&
            this.searchType == other.getSearchType() &&
            ((this.resultRange==null && other.getResultRange()==null) || 
             (this.resultRange!=null &&
              this.resultRange.equals(other.getResultRange())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getMatchType();
        _hashCode += (isUsePhonetic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSearchType();
        if (getResultRange() != null) {
            _hashCode += getResultRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePhonetic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "usePhonetic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "resultRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ResultRange"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
