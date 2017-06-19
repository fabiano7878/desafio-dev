package br.com.desafiodev.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.desafiodev.implementacao.EnderecoFactory;
import br.com.desafiodev.modelo.Endereco;

public class TesteEndereco {
	
	private EnderecoFactory end = new EnderecoFactory();
	
	//private List<Endereco> listaEnderecos = new ArrayList<Endereco>();
	
	public static void main(String [] args){
		
		//this.end.getEnd().setStreet(endereco.toLowerCase().replaceAll("@|*|.|", ""));
		
		String dados = "Rua Ibiporã, 101, São Pàulo, SP;Rua taulfo Alves, 428 - casa 02, São Paulo, SP.";
				
		String dados1 = "";
				
		TesteEndereco teste = new TesteEndereco();
		
		teste.getEnd().getReceEndereco(dados);
		
				
		//teste.getReceEndereco(dados1);
		for(int i = 0; i < teste.getEnd().getListaEndereco().size(); i++){
			
			System.out.println(teste.getEnd().getListaEndereco().get(i).toString());
			
		}
		
	}	
	

	public EnderecoFactory getEnd() {
		return end;
	}


	public void setEnd(EnderecoFactory end) {
		this.end = end;
	}


	
	
	
}
