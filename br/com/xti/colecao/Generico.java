package br.com.xti.colecao;

import java.util.ArrayList;

/**
 * Classe criada para apresentar tipos de dados genericos
 * Esse recurso serve quando quero criar uma classe e não sei qual tipo de dado o objeto será instanciado
 * Ou quando preciso que um método aceite mais de um tipo de dado no parametro
 * @author Marcos Ribeiro
 */

public class Generico <E> { //a classe precisa de uma definição de tipo de elemento na construção
	
	E elemento; //o tipo de objeto que será instanciado é E que torna generico, sendo definido apenas no momento de instanciar o objeto
	
	public void setElemento (E objeto) {
		this.elemento = objeto;
	}
	
	public E getElemento () {
		return elemento;
	}
	
	/*Criando um metodo com parametro que engloba todos elementos que extendem da classe Number
	 * Integer, Float, Double, etc
	 * Caso eu queira apenas elementos que são pais da classe Number, trocaria a palavra extends por super
	 * */
	public double soma(ArrayList<? extends Number> lista) {
		double total = 0;
		for (Number number : lista) {
			total+= number.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>(); //defini que o tipo de dado será String
		
		g.setElemento("Lago Paranoá"); //aceita String
		//g.setElemento(12345); //nao aceita inteiro
		g.getElemento().toUpperCase();

	}

}
