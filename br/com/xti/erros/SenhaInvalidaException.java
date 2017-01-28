package br.com.xti.erros;

/**
 * Exception criada manualmente para receber uma mensagem de erro enviada por um metodo de outra classe
 * @author Marcos Ribeiro
 */

public class SenhaInvalidaException extends Exception {//todas exception extende da classe Exception
	
	public SenhaInvalidaException(String mensagem) {
		super(mensagem);//chamando o construtor utilizado na super classe Exception
	}

}
