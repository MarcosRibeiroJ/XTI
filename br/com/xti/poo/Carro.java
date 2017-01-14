package br.com.xti.poo;

/**
 * Classe para exemplificar a criacao de construtores de classe
 * @author Marcos Ribeiro
 */

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	//Construtor padrao vazio, nesse caso devo inicializar cada atributo separadamente
	public Carro() {
		
	}
	
	
	//Construtor que ja recebe como parametro os valores dos atributos do objeto, esse construtor chama o contrutor mais completo escrito abaixo utilizando o this
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this (modelo, velocidadeMaxima, segundosZeroACem, null); //chamando o contrutor mais completo descrito logo abaixo
		
	}
	
	//Construtor que ja recebe como parametro os valores dos atributos do objeto e outro objeto do tipo motor
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		
	}

}
