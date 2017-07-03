package br.com.maplink.desafiodev.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class Util {
	private static Locale ptBR = new Locale("pt","BR");
	private static ResourceBundle bundle;
	
	public static String retornaPropiedades(String nome, String tipo){
		//Bundle local com a chave do token
		if(!"messages".equals(tipo)){
			setBundle(ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.acesso", getPtBR()));
		}else{
			setBundle(ResourceBundle.getBundle("br.com.maplink.desafiodev.resource.messages", getPtBR()));
		}
		return  getBundle().getString(nome).toString();
	}

	public static ResourceBundle getBundle() {
		return bundle;
	}

	public static void setBundle(ResourceBundle bundle) {
		Util.bundle = bundle;
	}

	public static Locale getPtBR() {
		return ptBR;
	}
	
	
}
