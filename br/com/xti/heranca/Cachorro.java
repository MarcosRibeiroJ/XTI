package br.com.xti.heranca;

/**
 * Classe Cachorro que herda atributos e metodos da classe Animal
 * Teste: cachorro EH UM animal? 
 * @author Marcos Ribeiro
 */

public class Cachorro extends Animal {
	
	//Construtor padrao da classe, usamos o super para acessar o construtor padrao da super classe Animal e ja passar os dois parametros necessarios
	public Cachorro() {
		super(30, "Carne");
	}
	
	//Criando um metodo de fazerBarulho especifico dessa classe
	void fazerBarulho() {
		System.out.println("Au, Au!");
	}

}
