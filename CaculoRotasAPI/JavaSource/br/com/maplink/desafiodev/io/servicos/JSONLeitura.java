package br.com.maplink.desafiodev.io.servicos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.sun.jmx.snmp.Timestamp;

public class JSONLeitura {

	//Objeto do tipo Arquivo para a leitura no diretório. 
	private static File file;
	
	//Lista que recebe a lista de Json, acontece parse do JSON para String
	private List<String>listaJSONString;
	
	//Cria o parse de tratamento	
	private JSONObject jsonObject;
	
	
	public List leituraJSON()throws IOException {
		JSONParser parser = new JSONParser();


		try {
			
			Locale ptBR = new Locale("pt","BR");
			ResourceBundle bundle = ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.acesso", ptBR);		
			String path = bundle.getString("path");; 
			
			setFile(new File(path+"/listaEnderecos.json"));
			
			long arquivo1 = getFile().lastModified();			
			System.out.println("Last Modified: "+getFile().lastModified());
						
			FileReader fileReader = new FileReader(getFile());			
			BufferedReader reader = new BufferedReader(fileReader);
			
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			setJsonObject((JSONObject) parser.parse(new FileReader(getFile())));
			
			JSONArray arrEnderecos = (JSONArray) getJsonObject().get("listaEnderecos");
			
			int i = 0;
			Timestamp stampNow = new Timestamp();
			/**
			 * Instanciamos novo arquivo para comparar se há um novo arquivo no diretório.
			 * se houver, inserimos na lista os novos endereços.
			 */
			File fileNow = new File(path+"/listaEnderecos.json");
			while(fileNow.lastModified() > stampNow.getDateTime()){				
				fileNow = new File(path+"/listaEnderecos.json");
				
				arrEnderecos.add(fileNow);
				
				i++;
			}
			System.out.println("Last Modified: "+file.lastModified());
			fileReader.close();
			reader.close();
			
			//Salva nas variaveis os dados retirados do arquivo
			List<String>listaJSONString = new ArrayList<String>();
			if(!getJsonObject().isEmpty()){				
				for(int y = 0; y < arrEnderecos.size(); y++){
					listaJSONString.add(arrEnderecos.get(y).toString());
					System.out.println(listaJSONString.get(y));
				}
				
			}
			
		} 
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public static File getFile() {
		return file;
	}

	public static void setFile(File file) {
		JSONLeitura.file = file;
	}


	public JSONObject getJsonObject() {
		return jsonObject;
	}


	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public List<String> getListaJSONString() {
		return listaJSONString;
	}
	
	

}
