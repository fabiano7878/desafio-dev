package br.com.maplink.desafiodev.implementacao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import br.com.maplink.desafiodev.modelo.Endereco;

public class EnderecoRequest {

	private Endereco end;
	
	private List<Endereco>listaEndereco =  new ArrayList<Endereco>();
	
	private Properties props;
	
	public EnderecoRequest(){		
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public List<Endereco> getListaEndereco() {
						
		return listaEndereco;
	}

	
	@Override
	public String toString() {
			return "EnderecoFactory [end=" + end + ", listaEndereco=" + listaEndereco + "]";
	}
	
	
	/**
	 * Método responsável por receber a requisição com os parametros conforme contrato.
	 * Esperamos receber uma String, separando os parametros por "," e cada endereço por; 
	 * @param endereco
	 * @return List
	 */
	public List<Endereco> getEnderecosEntrada(String endereco){
		if(!"".equals(endereco) && endereco != null){			
						
			String[] listaAux = endereco.split(";");
			String[] listaSeparadora;
			for(int i = 0; i < listaAux.length; i++){
				end = new Endereco();
				listaSeparadora = listaAux[i].split(",");
					end.setStreet(listaSeparadora[0].toString());
					end.setNumber(listaSeparadora[1].toString());					
					end.setCity(listaSeparadora[2].toString());
					end.setState(listaSeparadora[3].toString());
					
					listaEndereco.add(end);
			
			}			
			
		}else{
			
			throw new NullPointerException("Dados do Endereço são Invalidos!");
		}
		
		
		return this.listaEndereco;
	}
	
	public List<String[]> DadosReqEndereco(){
		String [] dados = null;
		List<String[]>listaBundle = new ArrayList();
		String nomeProperties = "messages.properties";
		props = new Properties();
		InputStream itens = this.getClass().getResourceAsStream(nomeProperties);
		try{
			props.load(itens);
			itens.close();
			
			for(int i = 0; i < props.size(); i++ ){
								
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return listaBundle;
	}
	
}
