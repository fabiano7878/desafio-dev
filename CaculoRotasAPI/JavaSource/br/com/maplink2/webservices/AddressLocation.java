/**
 * AddressLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class AddressLocation  implements java.io.Serializable {
    private java.lang.String key;

    private br.com.maplink2.webservices.Address address;

    private java.lang.String zipL;

    private java.lang.String zipR;

    private boolean carAccess;

    private java.lang.String dataSource;

    private br.com.maplink2.webservices.Point point;

    public AddressLocation() {
    }

    public AddressLocation(
           java.lang.String key,
           br.com.maplink2.webservices.Address address,
           java.lang.String zipL,
           java.lang.String zipR,
           boolean carAccess,
           java.lang.String dataSource,
           br.com.maplink2.webservices.Point point) {
           this.key = key;
           this.address = address;
           this.zipL = zipL;
           this.zipR = zipR;
           this.carAccess = carAccess;
           this.dataSource = dataSource;
           this.point = point;
    }


    /**
     * Gets the key value for this AddressLocation.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this AddressLocation.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the address value for this AddressLocation.
     * 
     * @return address
     */
    public br.com.maplink2.webservices.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AddressLocation.
     * 
     * @param address
     */
    public void setAddress(br.com.maplink2.webservices.Address address) {
        this.address = address;
    }


    /**
     * Gets the zipL value for this AddressLocation.
     * 
     * @return zipL
     */
    public java.lang.String getZipL() {
        return zipL;
    }


    /**
     * Sets the zipL value for this AddressLocation.
     * 
     * @param zipL
     */
    public void setZipL(java.lang.String zipL) {
        this.zipL = zipL;
    }


    /**
     * Gets the zipR value for this AddressLocation.
     * 
     * @return zipR
     */
    public java.lang.String getZipR() {
        return zipR;
    }


    /**
     * Sets the zipR value for this AddressLocation.
     * 
     * @param zipR
     */
    public void setZipR(java.lang.String zipR) {
        this.zipR = zipR;
    }


    /**
     * Gets the carAccess value for this AddressLocation.
     * 
     * @return carAccess
     */
    public boolean isCarAccess() {
        return carAccess;
    }


    /**
     * Sets the carAccess value for this AddressLocation.
     * 
     * @param carAccess
     */
    public void setCarAccess(boolean carAccess) {
        this.carAccess = carAccess;
    }


    /**
     * Gets the dataSource value for this AddressLocation.
     * 
     * @return dataSource
     */
    public java.lang.String getDataSource() {
        return dataSource;
    }


    /**
     * Sets the dataSource value for this AddressLocation.
     * 
     * @param dataSource
     */
    public void setDataSource(java.lang.String dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * Gets the point value for this AddressLocation.
     * 
     * @return point
     */
    public br.com.maplink2.webservices.Point getPoint() {
        return point;
    }


    /**
     * Sets the point value for this AddressLocation.
     * 
     * @param point
     */
    public void setPoint(br.com.maplink2.webservices.Point point) {
        this.point = point;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressLocation)) return false;
        AddressLocation other = (AddressLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.zipL==null && other.getZipL()==null) || 
             (this.zipL!=null &&
              this.zipL.equals(other.getZipL()))) &&
            ((this.zipR==null && other.getZipR()==null) || 
             (this.zipR!=null &&
              this.zipR.equals(other.getZipR()))) &&
            this.carAccess == other.isCarAccess() &&
            ((this.dataSource==null && other.getDataSource()==null) || 
             (this.dataSource!=null &&
              this.dataSource.equals(other.getDataSource()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getZipL() != null) {
            _hashCode += getZipL().hashCode();
        }
        if (getZipR() != null) {
            _hashCode += getZipR().hashCode();
        }
        _hashCode += (isCarAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDataSource() != null) {
            _hashCode += getDataSource().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "zipL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "zipR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "carAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "dataSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
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
