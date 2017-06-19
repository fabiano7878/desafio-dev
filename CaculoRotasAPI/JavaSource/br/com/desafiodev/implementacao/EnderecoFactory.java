package br.com.desafiodev.implementacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import br.com.desafiodev.modelo.Endereco;

public class EnderecoFactory {

	private Endereco end;
	
	private List<Endereco>listaEndereco =  new ArrayList<Endereco>();
	
	public EnderecoFactory(){
		end = new Endereco();
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

	public List<Endereco> getReceEndereco(String endereco){
		//ArrayList listaAux = new ArrayList();		
				//endereco = endereco.replaceAll("*$&%#()'^~><", "#");
		if(!"".equals(endereco) && endereco != null){			
						
			String[] listaAux = endereco.split(";");
			String[] listaSeparadora;
			//int tamanhoEnderecos = listaAux.length;	
			for(int i = 0; i < listaAux.length; i++){
				listaSeparadora = listaAux[i].split(",");
					end.setStreet(listaSeparadora[0].toString());
					end.setNumber(listaSeparadora[1].toString());					
					end.setCity(listaSeparadora[2].toString());
					end.setState(listaSeparadora[3].toString());
					
					listaEndereco.add(end);
			
			}			
			
		}else{
			
			new NullPointerException("Dados do Endereço são Invalidos!");
		}
		
		
		return this.listaEndereco;
	}
	
	
	
	
}
