package br.com.xti.heranca;

/**
 * Classe Animal eh uma super classe, seus filhos irao herdar todos os seus atributos e metodos
 * Essa classe eh uma classe abstrata porque possui informacoes basicas que devem ser sobrescritas diretamente pelas classes filhas 
 * @author Marcos Ribeiro
 */

public abstract class Animal {
	
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
	
	abstract void fazerBarulho(); //metodo fazer barulho deve ser obrigatoriamente sobrescrito pelas classes filhas

}//fim classe
