package br.com.maplink.desafiodev.JUnit;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.xml.rpc.ServiceException;

import br.com.maplink.desafiodev.implementacao.EnderecoRequest;
import br.com.maplink.desafiodev.io.servicos.JSONEscrita;
import br.com.maplink.desafiodev.io.servicos.JSONLeitura;
import br.com.maplink.desafiodev.webservice.servicos.BuscaEndereco;

public class TesteEndereco {
	
	private EnderecoRequest end = new EnderecoRequest();
	
	private BuscaEndereco buscaEnd = new BuscaEndereco();
	
	public static <V> void main(String [] args) throws ServiceException, IOException{
		
		//String dados = "Rua Ibiporã, 101, São Pàulo, SP;Rua Ataulfo Alves, 428 - casa 02, São Paulo, SP.";
				
		//Bundle local com a chave do token
		Locale ptBR = new Locale("pt","BR");
		ResourceBundle bundle = ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.messages", ptBR);
		final String dados = bundle.getString("dados1").concat(bundle.getString("dados2").toString());
		
		TesteEndereco teste = new TesteEndereco();
		
		teste.getEnd().getEnderecosEntrada(dados);
		
		List<HashMap> listaHAsh = teste.getBuscaEnd().getBuscaEndereco(teste.getEnd().getListaEndereco());
		
	/*	JSONEscrita j = new JSONEscrita();
		j.escreveJSON();*/
		
		JSONLeitura l = new JSONLeitura();
		l.leituraJSON();
		
		for(HashMap lista:listaHAsh){
			System.out.println(lista.get("Zip code"));
		}
		
		for(int i = 0; i < teste.getEnd().getListaEndereco().size(); i++){
			
			System.out.print(teste.getEnd().getListaEndereco().get(i).getStreet().toString());
			System.out.print(teste.getEnd().getListaEndereco().get(i).getNumber().toString());
			System.out.print(teste.getEnd().getListaEndereco().get(i).getCity().toString());
			System.out.println(teste.getEnd().getListaEndereco().get(i).getState().toString());
		
			
		}
		
	}	
	

	public EnderecoRequest getEnd() {
		return end;
	}


	public void setEnd(EnderecoRequest end) {
		this.end = end;
	}


	public BuscaEndereco getBuscaEnd() {
		return buscaEnd;
	}


	public void setBuscaEnd(BuscaEndereco buscaEnd) {
		this.buscaEnd = buscaEnd;
	}
	
	
}
