/**
 * CityLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class CityLocation  implements java.io.Serializable {
    private br.com.maplink2.webservices.City city;

    private br.com.maplink2.webservices.Point point;

    private boolean carAccess;

    private java.lang.String zipRangeStart;

    private java.lang.String zipRangeEnd;

    private boolean capital;

    public CityLocation() {
    }

    public CityLocation(
           br.com.maplink2.webservices.City city,
           br.com.maplink2.webservices.Point point,
           boolean carAccess,
           java.lang.String zipRangeStart,
           java.lang.String zipRangeEnd,
           boolean capital) {
           this.city = city;
           this.point = point;
           this.carAccess = carAccess;
           this.zipRangeStart = zipRangeStart;
           this.zipRangeEnd = zipRangeEnd;
           this.capital = capital;
    }


    /**
     * Gets the city value for this CityLocation.
     * 
     * @return city
     */
    public br.com.maplink2.webservices.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this CityLocation.
     * 
     * @param city
     */
    public void setCity(br.com.maplink2.webservices.City city) {
        this.city = city;
    }


    /**
     * Gets the point value for this CityLocation.
     * 
     * @return point
     */
    public br.com.maplink2.webservices.Point getPoint() {
        return point;
    }


    /**
     * Sets the point value for this CityLocation.
     * 
     * @param point
     */
    public void setPoint(br.com.maplink2.webservices.Point point) {
        this.point = point;
    }


    /**
     * Gets the carAccess value for this CityLocation.
     * 
     * @return carAccess
     */
    public boolean isCarAccess() {
        return carAccess;
    }


    /**
     * Sets the carAccess value for this CityLocation.
     * 
     * @param carAccess
     */
    public void setCarAccess(boolean carAccess) {
        this.carAccess = carAccess;
    }


    /**
     * Gets the zipRangeStart value for this CityLocation.
     * 
     * @return zipRangeStart
     */
    public java.lang.String getZipRangeStart() {
        return zipRangeStart;
    }


    /**
     * Sets the zipRangeStart value for this CityLocation.
     * 
     * @param zipRangeStart
     */
    public void setZipRangeStart(java.lang.String zipRangeStart) {
        this.zipRangeStart = zipRangeStart;
    }


    /**
     * Gets the zipRangeEnd value for this CityLocation.
     * 
     * @return zipRangeEnd
     */
    public java.lang.String getZipRangeEnd() {
        return zipRangeEnd;
    }


    /**
     * Sets the zipRangeEnd value for this CityLocation.
     * 
     * @param zipRangeEnd
     */
    public void setZipRangeEnd(java.lang.String zipRangeEnd) {
        this.zipRangeEnd = zipRangeEnd;
    }


    /**
     * Gets the capital value for this CityLocation.
     * 
     * @return capital
     */
    public boolean isCapital() {
        return capital;
    }


    /**
     * Sets the capital value for this CityLocation.
     * 
     * @param capital
     */
    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityLocation)) return false;
        CityLocation other = (CityLocation) obj;
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
            this.carAccess == other.isCarAccess() &&
            ((this.zipRangeStart==null && other.getZipRangeStart()==null) || 
             (this.zipRangeStart!=null &&
              this.zipRangeStart.equals(other.getZipRangeStart()))) &&
            ((this.zipRangeEnd==null && other.getZipRangeEnd()==null) || 
             (this.zipRangeEnd!=null &&
              this.zipRangeEnd.equals(other.getZipRangeEnd()))) &&
            this.capital == other.isCapital();
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
        _hashCode += (isCarAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getZipRangeStart() != null) {
            _hashCode += getZipRangeStart().hashCode();
        }
        if (getZipRangeEnd() != null) {
            _hashCode += getZipRangeEnd().hashCode();
        }
        _hashCode += (isCapital() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CityLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation"));
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
        elemField.setFieldName("carAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "carAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "zipRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "zipRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
