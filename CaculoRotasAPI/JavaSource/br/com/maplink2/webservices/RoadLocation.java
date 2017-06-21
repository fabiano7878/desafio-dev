/**
 * RoadLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class RoadLocation  implements java.io.Serializable {
    private br.com.maplink2.webservices.Road road;

    private br.com.maplink2.webservices.RoadDetail roadDetail;

    public RoadLocation() {
    }

    public RoadLocation(
           br.com.maplink2.webservices.Road road,
           br.com.maplink2.webservices.RoadDetail roadDetail) {
           this.road = road;
           this.roadDetail = roadDetail;
    }


    /**
     * Gets the road value for this RoadLocation.
     * 
     * @return road
     */
    public br.com.maplink2.webservices.Road getRoad() {
        return road;
    }


    /**
     * Sets the road value for this RoadLocation.
     * 
     * @param road
     */
    public void setRoad(br.com.maplink2.webservices.Road road) {
        this.road = road;
    }


    /**
     * Gets the roadDetail value for this RoadLocation.
     * 
     * @return roadDetail
     */
    public br.com.maplink2.webservices.RoadDetail getRoadDetail() {
        return roadDetail;
    }


    /**
     * Sets the roadDetail value for this RoadLocation.
     * 
     * @param roadDetail
     */
    public void setRoadDetail(br.com.maplink2.webservices.RoadDetail roadDetail) {
        this.roadDetail = roadDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoadLocation)) return false;
        RoadLocation other = (RoadLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.road==null && other.getRoad()==null) || 
             (this.road!=null &&
              this.road.equals(other.getRoad()))) &&
            ((this.roadDetail==null && other.getRoadDetail()==null) || 
             (this.roadDetail!=null &&
              this.roadDetail.equals(other.getRoadDetail())));
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
        if (getRoad() != null) {
            _hashCode += getRoad().hashCode();
        }
        if (getRoadDetail() != null) {
            _hashCode += getRoadDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoadLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("road");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "road"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Road"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "roadDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadDetail"));
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
