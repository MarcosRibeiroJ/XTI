package br.com.xti.java;

/**
 * Classe que apresenta o conceito de token e o metodo split
 * Tokens sao trechos menores de strings
 * Utilizamos o metodo split para quebrar uma string em tokens
 * Usamos o delimitador "; " para quebrar a string em tokens
 * @author Marcos Ribeiro
 */

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JavaScript; jQuery; Java";//string maior
		String[] tokens = s.split("; ");//quebrando a string em tokens utilizando o metodo split com "; " de delimitador
		System.out.println(tokens.length + " tokens");//verificando a quantidade de elementos (tokens) resultantes da divisao
		for(String token : tokens) {
			System.out.println(token); //imprimindo os elementos
		}

	}

}
