/**
 * CityLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class CityLocationInfo  implements java.io.Serializable {
    private int recordCount;

    private int pageCount;

    private br.com.maplink2.webservices.CityLocation[] cityLocation;

    public CityLocationInfo() {
    }

    public CityLocationInfo(
           int recordCount,
           int pageCount,
           br.com.maplink2.webservices.CityLocation[] cityLocation) {
           this.recordCount = recordCount;
           this.pageCount = pageCount;
           this.cityLocation = cityLocation;
    }


    /**
     * Gets the recordCount value for this CityLocationInfo.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this CityLocationInfo.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the pageCount value for this CityLocationInfo.
     * 
     * @return pageCount
     */
    public int getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this CityLocationInfo.
     * 
     * @param pageCount
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets the cityLocation value for this CityLocationInfo.
     * 
     * @return cityLocation
     */
    public br.com.maplink2.webservices.CityLocation[] getCityLocation() {
        return cityLocation;
    }


    /**
     * Sets the cityLocation value for this CityLocationInfo.
     * 
     * @param cityLocation
     */
    public void setCityLocation(br.com.maplink2.webservices.CityLocation[] cityLocation) {
        this.cityLocation = cityLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityLocationInfo)) return false;
        CityLocationInfo other = (CityLocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.recordCount == other.getRecordCount() &&
            this.pageCount == other.getPageCount() &&
            ((this.cityLocation==null && other.getCityLocation()==null) || 
             (this.cityLocation!=null &&
              java.util.Arrays.equals(this.cityLocation, other.getCityLocation())));
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
        _hashCode += getRecordCount();
        _hashCode += getPageCount();
        if (getCityLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCityLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCityLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CityLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "recordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "pageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "cityLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation"));
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
