package br.com.xti.heranca;

/**
 * Classe Animal eh uma super classe, seus filhos irao herdar todos os seus atributos e metodos 
 * @author Marcos Ribeiro
 */

public class Animal {
	
	double peso;
	String comida;
	
	void dormir() {
		System.out.println("Dormiu!");
	}
	
	void fazerBarulho() {
		System.out.println("Fazer Barulho");
	}

}//fim classe
