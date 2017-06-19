package br.com.desafiodev.webservice.maplink;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.AddressFinderLocator;
import br.com.maplink2.webservices.AddressInfo;
import br.com.maplink2.webservices.AddressLocation;
import br.com.maplink2.webservices.AddressOptions;
import br.com.maplink2.webservices.City;
import br.com.maplink2.webservices.ResultRange;

public class AcharEndereco implements Serializable{

	
	public static void main(String []args) throws RemoteException, ServiceException{
		
	final String TOKEN = "TOKEN";
	
	final String NEW_LINE = "\n";

	City city = new City();
	city.setName("São Paulo");	
	city.setState("SP");

	Address address = new Address();
	address.setStreet("Avenida Paulista");
	address.setHouseNumber("1000");
	address.setCity(city);

	ResultRange resultRange = new ResultRange();
	resultRange.setPageIndex(1);
	resultRange.setRecordsPerPage(10);

	AddressOptions addressOptions = new AddressOptions();
	addressOptions.setUsePhonetic(true);
	addressOptions.setSearchType(2);
	addressOptions.setResultRange(resultRange);

	AddressFinderLocator addressFinderLocator = new AddressFinderLocator();
	AddressInfo findAddressResponse = addressFinderLocator.getAddressFinderSoap().findAddress(address, addressOptions, TOKEN);
	  	
	AddressLocation[] addressLocations = findAddressResponse.getAddressLocation();

	StringBuilder findAddressResult = new StringBuilder();

	findAddressResult.append("Page Count: ").append(findAddressResponse.getPageCount());
	findAddressResult.append(", Record Count: ").append(findAddressResponse.getRecordCount());


	for (AddressLocation addressLocation : addressLocations) {
		findAddressResult.append(NEW_LINE);
		findAddressResult.append("Key: ").append(addressLocation.getKey());
		findAddressResult.append(", Street name: ").append(addressLocation.getAddress().getStreet());
		findAddressResult.append(", Street number: ").append( addressLocation.getAddress().getHouseNumber());
		findAddressResult.append(", Zip code: ").append(addressLocation.getAddress().getZip());
		findAddressResult.append(", District: ").append(addressLocation.getAddress().getDistrict());
		findAddressResult.append(", City: ").append(addressLocation.getAddress().getCity().getName());
		findAddressResult.append(", State: ").append(addressLocation.getAddress().getCity().getState());
		findAddressResult.append(", Left zip code: ").append(addressLocation.getZipL());
		findAddressResult.append(", Right zip code: ").append(addressLocation.getZipR());
		findAddressResult.append(", Car access: ").append(addressLocation.isCarAccess());
		findAddressResult.append(", Data Source: ").append(addressLocation.getDataSource());
		findAddressResult.append(", Latitude: ").append(addressLocation.getPoint().getY());
		findAddressResult.append(", Longitude: ").append(addressLocation.getPoint().getX());
	}

	System.out.println(findAddressResult);	

	}
		
}
