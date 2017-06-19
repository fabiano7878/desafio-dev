package br.com.maplink2.webservices;

public class AddressFinderSoapProxy implements br.com.maplink2.webservices.AddressFinderSoap {
  private String _endpoint = null;
  private br.com.maplink2.webservices.AddressFinderSoap addressFinderSoap = null;
  
  public AddressFinderSoapProxy() {
    _initAddressFinderSoapProxy();
  }
  
  public AddressFinderSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddressFinderSoapProxy();
  }
  
  private void _initAddressFinderSoapProxy() {
    try {
      addressFinderSoap = (new br.com.maplink2.webservices.AddressFinderLocator()).getAddressFinderSoap();
      if (addressFinderSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addressFinderSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addressFinderSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addressFinderSoap != null)
      ((javax.xml.rpc.Stub)addressFinderSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.maplink2.webservices.AddressFinderSoap getAddressFinderSoap() {
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap;
  }
  
  public br.com.maplink2.webservices.POIInfo findPOI(java.lang.String name, br.com.maplink2.webservices.City city, br.com.maplink2.webservices.ResultRange resultRange, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.findPOI(name, city, resultRange, token);
  }
  
  public br.com.maplink2.webservices.AddressInfo findAddress(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.findAddress(address, ao, token);
  }
  
  public br.com.maplink2.webservices.AddressLocation getAddress(br.com.maplink2.webservices.Point point, java.lang.String token, double tolerance) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.getAddress(point, token, tolerance);
  }
  
  public br.com.maplink2.webservices.Point getXY(br.com.maplink2.webservices.Address address, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.getXY(address, token);
  }
  
  public br.com.maplink2.webservices.MapInfo getXYRadiusWithMap(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.MapOptions mo, int radius, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.getXYRadiusWithMap(address, mo, radius, token);
  }
  
  public br.com.maplink2.webservices.CityLocationInfo findCity(br.com.maplink2.webservices.City cidade, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.findCity(cidade, ao, token);
  }
  
  public br.com.maplink2.webservices.CrossStreetLocation[] getCrossStreetXY(br.com.maplink2.webservices.City cidade, java.lang.String firstStreet, java.lang.String secondStreet, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.getCrossStreetXY(cidade, firstStreet, secondStreet, token);
  }
  
  public br.com.maplink2.webservices.AddressLocation[] getCrossStreetAddress(br.com.maplink2.webservices.Point point, java.lang.String token) throws java.rmi.RemoteException{
    if (addressFinderSoap == null)
      _initAddressFinderSoapProxy();
    return addressFinderSoap.getCrossStreetAddress(point, token);
  }
  
  
}