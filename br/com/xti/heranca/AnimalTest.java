package br.com.xti.heranca;

/**
 * Classe Animal criada para testar a heranca
 * Nesse exemplo criaremos um objeto cachorro e um objeto galinha, ambos herdando atributos e metodos da classe animal 
 * @author Marcos Ribeiro
 */

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		

	}//fim main

}//fim classe
