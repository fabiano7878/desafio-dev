package br.com.desafiodev.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.desafiodev.implementacao.EnderecoRequest;
import br.com.desafiodev.modelo.Endereco;

public class TesteEndereco {
	
	private EnderecoRequest end = new EnderecoRequest();
	
	//private List<Endereco> listaEnderecos = new ArrayList<Endereco>();
	
	public static void main(String [] args){
		
		//this.end.getEnd().setStreet(endereco.toLowerCase().replaceAll("@|*|.|", ""));
		
		String dados = "Rua Ibiporã, 101, São Pàulo, SP;Rua Ataulfo Alves, 428 - casa 02, São Paulo, SP.";
				
		String dados1 = "";
				
		TesteEndereco teste = new TesteEndereco();
		
		teste.getEnd().getReceEndereco(dados);
		
				
		//teste.getReceEndereco(dados1);
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


	
	
	
}
