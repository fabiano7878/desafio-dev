package br.com.maplink.desafiodev.io.servicos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.json.simple.JSONObject;

import com.sun.jmx.snmp.Timestamp;

/**
 * Classes necessárias
 * @author fabma
 *
 */
public class JSONEscrita {


	public void escreveJSON() {

		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();

		FileWriter writeFile = null;

		//Armazena dados em um Objeto JSON
		jsonObject.put("endereco", "Rua Ibiporã");
		jsonObject.put("numero", "101");
		jsonObject.put("cidade", "São Paulo");
		jsonObject.put("estado", "SP");

		try{
			
			Timestamp nomeTime = new Timestamp();
			
			Locale ptBR = new Locale("pt","BR");
			ResourceBundle bundle = ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.acesso", ptBR);
			
			String path = bundle.getString("path"); 
			String arquivo = path.concat("listaEnderecos_"+nomeTime.getDateTime()+".json");
			
			Timestamp nomeTime2 = new Timestamp();
			
			if(nomeTime.getDateTime() > nomeTime2.getDateTime()){
				System.out.println("nomeTime: "+nomeTime.getDateTime());
				System.out.println("nomeTime2: "+nomeTime2.getDateTime());
			}
			
			System.out.println("Gravando: "+arquivo);
			
			writeFile = new FileWriter(arquivo);
			//Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		//Imprimne na Tela o Objeto JSON para vizualização
		System.out.println(jsonObject);

	}

}
