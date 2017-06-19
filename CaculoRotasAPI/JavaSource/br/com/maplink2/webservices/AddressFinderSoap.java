/**
 * AddressFinderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public interface AddressFinderSoap extends java.rmi.Remote {

    /**
     * Devolve uma lista contendo POI candidatos.
     */
    public br.com.maplink2.webservices.POIInfo findPOI(java.lang.String name, br.com.maplink2.webservices.City city, br.com.maplink2.webservices.ResultRange resultRange, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve uma lista contendo endereços candidatos.
     */
    public br.com.maplink2.webservices.AddressInfo findAddress(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve o endereço do ponto informado.
     */
    public br.com.maplink2.webservices.AddressLocation getAddress(br.com.maplink2.webservices.Point point, java.lang.String token, double tolerance) throws java.rmi.RemoteException;

    /**
     * Devolve a coordenada do endereço informado.
     */
    public br.com.maplink2.webservices.Point getXY(br.com.maplink2.webservices.Address address, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve a a coordenada do ponto informado e a URL do mapa.
     */
    public br.com.maplink2.webservices.MapInfo getXYRadiusWithMap(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.MapOptions mo, int radius, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve uma lista contendo dados da cidade informada.
     */
    public br.com.maplink2.webservices.CityLocationInfo findCity(br.com.maplink2.webservices.City cidade, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve a coordenada de um cruzamento
     */
    public br.com.maplink2.webservices.CrossStreetLocation[] getCrossStreetXY(br.com.maplink2.webservices.City cidade, java.lang.String firstStreet, java.lang.String secondStreet, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Devolve os cruzamentos de uma coordenada
     */
    public br.com.maplink2.webservices.AddressLocation[] getCrossStreetAddress(br.com.maplink2.webservices.Point point, java.lang.String token) throws java.rmi.RemoteException;
}
