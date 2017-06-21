/**
 * AddressFinderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public interface AddressFinderSoap extends java.rmi.Remote {

    /**
     * Retorna uma lista contendo POI candidatos.
     */
    public br.com.maplink2.webservices.POIInfo findPOI(java.lang.String name, br.com.maplink2.webservices.City city, br.com.maplink2.webservices.ResultRange resultRange, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna uma lista contendo endereços candidatos.
     */
    public br.com.maplink2.webservices.AddressInfo findAddress(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna uma lista contendo rodovias candidatas.
     */
    public br.com.maplink2.webservices.RoadInfo findRoad(br.com.maplink2.webservices.Road road, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna uma lista contendo bairros/distritos candidatos.
     */
    public br.com.maplink2.webservices.DistrictInfo findDistrict(br.com.maplink2.webservices.District district, br.com.maplink2.webservices.ResultRange rr, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna o endereço do ponto informado.
     */
    public br.com.maplink2.webservices.AddressLocation getAddress(br.com.maplink2.webservices.Point point, java.lang.String token, double tolerance) throws java.rmi.RemoteException;

    /**
     * Retorna a coordenada do endereço informado.
     */
    public br.com.maplink2.webservices.Point getXY(br.com.maplink2.webservices.Address address, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna a coordenada da rodovia informada.
     */
    public br.com.maplink2.webservices.Point getRoadXY(br.com.maplink2.webservices.Road road, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna a a coordenada do ponto informado e a URL do mapa.
     */
    public br.com.maplink2.webservices.MapInfo getXYRadiusWithMap(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.MapOptions mo, int radius, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna uma lista contendo dados da cidade informada.
     */
    public br.com.maplink2.webservices.CityLocationInfo findCity(br.com.maplink2.webservices.City cidade, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException;
}
