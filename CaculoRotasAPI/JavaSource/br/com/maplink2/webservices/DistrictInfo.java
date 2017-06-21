/**
 * DistrictInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class DistrictInfo  implements java.io.Serializable {
    private int recordCount;

    private int pageCount;

    private br.com.maplink2.webservices.DistrictLocation[] districtLocation;

    public DistrictInfo() {
    }

    public DistrictInfo(
           int recordCount,
           int pageCount,
           br.com.maplink2.webservices.DistrictLocation[] districtLocation) {
           this.recordCount = recordCount;
           this.pageCount = pageCount;
           this.districtLocation = districtLocation;
    }


    /**
     * Gets the recordCount value for this DistrictInfo.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this DistrictInfo.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the pageCount value for this DistrictInfo.
     * 
     * @return pageCount
     */
    public int getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this DistrictInfo.
     * 
     * @param pageCount
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets the districtLocation value for this DistrictInfo.
     * 
     * @return districtLocation
     */
    public br.com.maplink2.webservices.DistrictLocation[] getDistrictLocation() {
        return districtLocation;
    }


    /**
     * Sets the districtLocation value for this DistrictInfo.
     * 
     * @param districtLocation
     */
    public void setDistrictLocation(br.com.maplink2.webservices.DistrictLocation[] districtLocation) {
        this.districtLocation = districtLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistrictInfo)) return false;
        DistrictInfo other = (DistrictInfo) obj;
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
            ((this.districtLocation==null && other.getDistrictLocation()==null) || 
             (this.districtLocation!=null &&
              java.util.Arrays.equals(this.districtLocation, other.getDistrictLocation())));
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
        if (getDistrictLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistrictLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistrictLocation(), i);
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
        new org.apache.axis.description.TypeDesc(DistrictInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictInfo"));
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
        elemField.setFieldName("districtLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "districtLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictLocation"));
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
