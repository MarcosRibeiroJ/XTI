package br.com.xti.colecao;

import java.util.ArrayList;

/**
 * Classe criada para apresentar tipos de dados genericos
 * Esse recurso serve quando quero criar uma classe e n�o sei qual tipo de dado o objeto ser� instanciado
 * Ou quando preciso que um m�todo aceite mais de um tipo de dado no parametro
 * @author Marcos Ribeiro
 */

public class Generico <E> { //a classe precisa de uma defini��o de tipo de elemento na constru��o
	
	E elemento; //o tipo de objeto que ser� instanciado � E que torna generico, sendo definido apenas no momento de instanciar o objeto
	
	public void setElemento (E objeto) {
		this.elemento = objeto;
	}
	
	public E getElemento () {
		return elemento;
	}
	
	/*Criando um metodo com parametro que engloba todos elementos que extendem da classe Number
	 * Integer, Float, Double, etc
	 * Caso eu queira apenas elementos que s�o pais da classe Number, trocaria a palavra extends por super
	 * */
	public double soma(ArrayList<? extends Number> lista) {
		double total = 0;
		for (Number number : lista) {
			total+= number.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>(); //defini que o tipo de dado ser� String
		
		g.setElemento("Lago Parano�"); //aceita String
		//g.setElemento(12345); //nao aceita inteiro
		g.getElemento().toUpperCase();

	}

}
