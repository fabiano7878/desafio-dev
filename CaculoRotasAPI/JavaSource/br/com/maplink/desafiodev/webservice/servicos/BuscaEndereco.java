package br.com.maplink.desafiodev.webservice.servicos;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.xml.rpc.ServiceException;

import br.com.maplink.desafiodev.implementacao.EnderecoRequest;
import br.com.maplink.desafiodev.modelo.Endereco;
import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.AddressFinderLocator;
import br.com.maplink2.webservices.AddressInfo;
import br.com.maplink2.webservices.AddressLocation;
import br.com.maplink2.webservices.AddressOptions;
import br.com.maplink2.webservices.City;
import br.com.maplink2.webservices.ResultRange;

public class BuscaEndereco implements Serializable{

	private EnderecoRequest end = new EnderecoRequest();

	public List<HashMap> getBuscaEndereco(List<Endereco> lista) throws RemoteException, ServiceException{

		//Bundle local com a chave do token
		Locale ptBR = new Locale("pt","BR");
		ResourceBundle bundle = ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.messages", ptBR);
		final String TOKEN = bundle.getString("token").toString();

		final String NEW_LINE = "\n";

		List<Endereco> listaEndereco =  lista;

		City city = null;
		Address address = null;
		ResultRange resultRange = null;
		AddressFinderLocator addressFinderLocator = null;
		AddressInfo findAddressResponse = null;
		AddressLocation[] addressLocations = null;
		StringBuilder findAddressResult = null;
		HashMap m = null;
		List<HashMap> listaHash = new ArrayList<HashMap>();

		for(Endereco endereco :listaEndereco){

			city = new City();
			city.setName(endereco.getCity());
			city.setState(endereco.getState());

			address = new Address();
			address.setStreet(endereco.getStreet());
			address.setHouseNumber(endereco.getNumber());
			address.setCity(city);

			resultRange = new ResultRange();
			resultRange.setPageIndex(1);
			resultRange.setRecordsPerPage(10);

			AddressOptions addressOptions = new AddressOptions();
			addressOptions.setUsePhonetic(true);
			addressOptions.setSearchType(2);
			addressOptions.setResultRange(resultRange);

			addressFinderLocator = new AddressFinderLocator();
			findAddressResponse = addressFinderLocator.getAddressFinderSoap().findAddress(address, addressOptions, TOKEN);

			addressLocations = findAddressResponse.getAddressLocation();

			findAddressResult = new StringBuilder();

			findAddressResult.append("Page Count: ").append(findAddressResponse.getPageCount());
			findAddressResult.append(", Record Count: ").append(findAddressResponse.getRecordCount());

			m = new HashMap();

			for (AddressLocation addressLocation : addressLocations) {
				findAddressResult.append(NEW_LINE);
				findAddressResult.append("Key: ").append(addressLocation.getKey());
				m.put("Key", addressLocation.getKey());		
				findAddressResult.append(", Street name: ").append(addressLocation.getAddress().getStreet());
				m.put("Street", addressLocation.getAddress().getStreet());
				findAddressResult.append(", Street number: ").append( addressLocation.getAddress().getHouseNumber());
				m.put("number", addressLocation.getAddress().getHouseNumber());
				findAddressResult.append(", Zip code: ").append(addressLocation.getAddress().getZip());
				m.put("Zip code", addressLocation.getAddress().getZip());
				findAddressResult.append(", District: ").append(addressLocation.getAddress().getDistrict());
				m.put("District", addressLocation.getAddress().getDistrict());
				findAddressResult.append(", City: ").append(addressLocation.getAddress().getCity().getName());
				m.put("City", addressLocation.getAddress().getCity().getName());
				findAddressResult.append(", State: ").append(addressLocation.getAddress().getCity().getState());
				m.put("State", addressLocation.getAddress().getCity().getState());
				findAddressResult.append(", Left zip code: ").append(addressLocation.getZipL());
				m.put("Left zip code", addressLocation.getZipL());
				findAddressResult.append(", Right zip code: ").append(addressLocation.getZipR());
				m.put("Right zip code", addressLocation.getZipR());
				findAddressResult.append(", Car access: ").append(addressLocation.isCarAccess());
				m.put("Car access", addressLocation.isCarAccess());
				findAddressResult.append(", Data Source: ").append(addressLocation.getDataSource());
				m.put("Data Source", addressLocation.getDataSource());
				findAddressResult.append(", Latitude: ").append(addressLocation.getPoint().getY());
				m.put("Latitude", addressLocation.getPoint().getY());
				findAddressResult.append(", Longitude: ").append(addressLocation.getPoint().getX());
				m.put("Longitude", addressLocation.getPoint().getX());
			}

			System.out.println(findAddressResult);
			listaHash.add(m);
		}


		return listaHash;
	}


}
