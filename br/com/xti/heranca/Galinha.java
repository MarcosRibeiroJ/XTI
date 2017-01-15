package br.com.xti.heranca;

/**
 * Classe Galinha que herda atributos e metodos da classe Animal 
 * Teste: galinha EH UM animal? 
 * @author Marcos Ribeiro
 */

public class Galinha extends Animal {
	
	//Construtor padrao da classe, usamos o super para acessar o construtor padrao da super classe Animal e ja passar os dois parametros necessarios
	public Galinha() {
		super(20, "Milho");
	}

}
