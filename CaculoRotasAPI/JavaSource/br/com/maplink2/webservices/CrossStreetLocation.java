/**
 * CrossStreetLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class CrossStreetLocation  implements java.io.Serializable {
    private br.com.maplink2.webservices.City city;

    private br.com.maplink2.webservices.Point point;

    private java.lang.String crossStreet;

    private java.lang.String district;

    private java.lang.String street;

    private java.lang.String zip;

    public CrossStreetLocation() {
    }

    public CrossStreetLocation(
           br.com.maplink2.webservices.City city,
           br.com.maplink2.webservices.Point point,
           java.lang.String crossStreet,
           java.lang.String district,
           java.lang.String street,
           java.lang.String zip) {
           this.city = city;
           this.point = point;
           this.crossStreet = crossStreet;
           this.district = district;
           this.street = street;
           this.zip = zip;
    }


    /**
     * Gets the city value for this CrossStreetLocation.
     * 
     * @return city
     */
    public br.com.maplink2.webservices.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this CrossStreetLocation.
     * 
     * @param city
     */
    public void setCity(br.com.maplink2.webservices.City city) {
        this.city = city;
    }


    /**
     * Gets the point value for this CrossStreetLocation.
     * 
     * @return point
     */
    public br.com.maplink2.webservices.Point getPoint() {
        return point;
    }


    /**
     * Sets the point value for this CrossStreetLocation.
     * 
     * @param point
     */
    public void setPoint(br.com.maplink2.webservices.Point point) {
        this.point = point;
    }


    /**
     * Gets the crossStreet value for this CrossStreetLocation.
     * 
     * @return crossStreet
     */
    public java.lang.String getCrossStreet() {
        return crossStreet;
    }


    /**
     * Sets the crossStreet value for this CrossStreetLocation.
     * 
     * @param crossStreet
     */
    public void setCrossStreet(java.lang.String crossStreet) {
        this.crossStreet = crossStreet;
    }


    /**
     * Gets the district value for this CrossStreetLocation.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this CrossStreetLocation.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the street value for this CrossStreetLocation.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this CrossStreetLocation.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the zip value for this CrossStreetLocation.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this CrossStreetLocation.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrossStreetLocation)) return false;
        CrossStreetLocation other = (CrossStreetLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint()))) &&
            ((this.crossStreet==null && other.getCrossStreet()==null) || 
             (this.crossStreet!=null &&
              this.crossStreet.equals(other.getCrossStreet()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        if (getCrossStreet() != null) {
            _hashCode += getCrossStreet().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrossStreetLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CrossStreetLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "City"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "crossStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
