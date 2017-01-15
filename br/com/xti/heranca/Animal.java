package br.com.xti.heranca;

/**
 * Classe Animal eh uma super classe, seus filhos irao herdar todos os seus atributos e metodos 
 * @author Marcos Ribeiro
 */

public class Animal {
	
	double peso;
	String comida;
	
	//Criado um construtor padrao para a super classe animal, esse construtor ja recebe os atributos da classe no parametro
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir() {
		System.out.println("Dormiu!");
	}
	
	void fazerBarulho() {
		System.out.println("Fazer Barulho");
	}

}//fim classe
