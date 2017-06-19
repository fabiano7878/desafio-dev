/**
 * AddressFinderLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class AddressFinderLocator extends org.apache.axis.client.Service implements br.com.maplink2.webservices.AddressFinder {

    public AddressFinderLocator() {
    }


    public AddressFinderLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressFinderLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddressFinderSoap
    private java.lang.String AddressFinderSoap_address = "http://services.maplink.com.br/webservices/v3/AddressFinder/AddressFinder.asmx";

    public java.lang.String getAddressFinderSoapAddress() {
        return AddressFinderSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddressFinderSoapWSDDServiceName = "AddressFinderSoap";

    public java.lang.String getAddressFinderSoapWSDDServiceName() {
        return AddressFinderSoapWSDDServiceName;
    }

    public void setAddressFinderSoapWSDDServiceName(java.lang.String name) {
        AddressFinderSoapWSDDServiceName = name;
    }

    public br.com.maplink2.webservices.AddressFinderSoap getAddressFinderSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddressFinderSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddressFinderSoap(endpoint);
    }

    public br.com.maplink2.webservices.AddressFinderSoap getAddressFinderSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.maplink2.webservices.AddressFinderSoapStub _stub = new br.com.maplink2.webservices.AddressFinderSoapStub(portAddress, this);
            _stub.setPortName(getAddressFinderSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddressFinderSoapEndpointAddress(java.lang.String address) {
        AddressFinderSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.maplink2.webservices.AddressFinderSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.maplink2.webservices.AddressFinderSoapStub _stub = new br.com.maplink2.webservices.AddressFinderSoapStub(new java.net.URL(AddressFinderSoap_address), this);
                _stub.setPortName(getAddressFinderSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddressFinderSoap".equals(inputPortName)) {
            return getAddressFinderSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressFinder");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressFinderSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddressFinderSoap".equals(portName)) {
            setAddressFinderSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
