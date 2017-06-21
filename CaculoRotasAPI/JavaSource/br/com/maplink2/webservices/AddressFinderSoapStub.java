/**
 * AddressFinderSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class AddressFinderSoapStub extends org.apache.axis.client.Stub implements br.com.maplink2.webservices.AddressFinderSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPOI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "city"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "City"), br.com.maplink2.webservices.City.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "resultRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ResultRange"), br.com.maplink2.webservices.ResultRange.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POIInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.POIInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findPOIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Address"), br.com.maplink2.webservices.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressOptions"), br.com.maplink2.webservices.AddressOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.AddressInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findRoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "road"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Road"), br.com.maplink2.webservices.Road.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.RoadInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findRoadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDistrict");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "District"), br.com.maplink2.webservices.District.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ResultRange"), br.com.maplink2.webservices.ResultRange.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.DistrictInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findDistrictResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"), br.com.maplink2.webservices.Point.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "tolerance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressLocation"));
        oper.setReturnClass(br.com.maplink2.webservices.AddressLocation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getXY");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Address"), br.com.maplink2.webservices.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
        oper.setReturnClass(br.com.maplink2.webservices.Point.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getXYResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoadXY");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "road"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Road"), br.com.maplink2.webservices.Road.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
        oper.setReturnClass(br.com.maplink2.webservices.Point.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRoadXYResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getXYRadiusWithMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Address"), br.com.maplink2.webservices.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "mo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapOptions"), br.com.maplink2.webservices.MapOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "radius"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.MapInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getXYRadiusWithMapResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "cidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "City"), br.com.maplink2.webservices.City.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressOptions"), br.com.maplink2.webservices.AddressOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocationInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.CityLocationInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findCityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public AddressFinderSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AddressFinderSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AddressFinderSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Address");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.AddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.AddressLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.AddressOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfAddressLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.AddressLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressLocation");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AddressLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfCityLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.CityLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfDistrictLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.DistrictLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictLocation");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfPOILocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.POILocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POILocation");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POILocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRoadLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RoadLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadLocation");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "City");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.City.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.CityLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "CityLocationInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.CityLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "District");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.District.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.DistrictInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "DistrictLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.DistrictLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Extent");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Extent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapSize");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POIInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.POIInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POILocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.POILocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Point.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ResultRange");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.ResultRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Road");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Road.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadDetail");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RoadDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RoadInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadLocation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RoadLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.maplink2.webservices.POIInfo findPOI(java.lang.String name, br.com.maplink2.webservices.City city, br.com.maplink2.webservices.ResultRange resultRange, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/findPOI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findPOI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, city, resultRange, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.POIInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.POIInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.POIInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.AddressInfo findAddress(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/findAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, ao, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.AddressInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.AddressInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.AddressInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.RoadInfo findRoad(br.com.maplink2.webservices.Road road, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/findRoad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findRoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {road, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RoadInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RoadInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RoadInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.DistrictInfo findDistrict(br.com.maplink2.webservices.District district, br.com.maplink2.webservices.ResultRange rr, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/findDistrict");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findDistrict"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, rr, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.DistrictInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.DistrictInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.DistrictInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.AddressLocation getAddress(br.com.maplink2.webservices.Point point, java.lang.String token, double tolerance) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {point, token, new java.lang.Double(tolerance)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.AddressLocation) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.AddressLocation) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.AddressLocation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.Point getXY(br.com.maplink2.webservices.Address address, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getXY");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getXY"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.Point) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.Point) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.Point.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.Point getRoadXY(br.com.maplink2.webservices.Road road, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRoadXY");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRoadXY"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {road, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.Point) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.Point) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.Point.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.MapInfo getXYRadiusWithMap(br.com.maplink2.webservices.Address address, br.com.maplink2.webservices.MapOptions mo, int radius, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getXYRadiusWithMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getXYRadiusWithMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, mo, new java.lang.Integer(radius), token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.MapInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.MapInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.MapInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.CityLocationInfo findCity(br.com.maplink2.webservices.City cidade, br.com.maplink2.webservices.AddressOptions ao, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/findCity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "findCity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cidade, ao, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.CityLocationInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.CityLocationInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.CityLocationInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
