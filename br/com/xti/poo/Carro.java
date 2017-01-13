package br.com.xti.poo;

/**
 * Classe para exemplificar a criacao de construtores de classe
 * @author Marcos Ribeiro
 */

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	//Construtor padrao vazio, nesse caso devo inicializar cada atributo separadamente
	public Carro() {
		
	}
	
	
	//Construtor que ja recebe como parametro os valores dos atributos do objeto
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		
	}

}
