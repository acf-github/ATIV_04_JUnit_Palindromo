package com.palindromo.domain;

public class Palindromo {

	
	public boolean isPalindromo(String texto) {
		
		if (isNullOrEmpty(texto)) {
			throw new RuntimeException("O valor nao pode ser nulo ou vazio");
		}
		
		texto = texto.replaceAll("\\s","");
		String textoAoContrario = "";
		int tamanho = texto.length();
		while (tamanho > 0) {
			textoAoContrario = textoAoContrario + texto.charAt(tamanho -1);
			tamanho--;
		}
		
		return textoAoContrario.equalsIgnoreCase(texto);
	}
	
	
	
	
	private boolean isNullOrEmpty(String str) {
		boolean retorno = false;
		if (str == null || str.isEmpty()) {
			retorno = true;
		}
		return retorno;
	}
}
