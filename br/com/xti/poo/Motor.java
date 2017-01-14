package br.com.xti.poo;

/**
 * Classe para exemplificar a composicao ou relacionamento tem um
 * Nesse exemplo o objeto do tipo Motor ira compor um objeto do tipo Carro
 * @author Marcos Ribeiro
 */

public class Motor {
	
	String tipo;
	int potencia;
	
	public Motor() {
		
	}
	
	public Motor(String tipo, int potencia) {
		this.tipo = tipo;
		this.potencia = potencia;
	}

}
