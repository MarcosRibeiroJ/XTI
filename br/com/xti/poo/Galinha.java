package br.com.xti.poo;

/**
 * Classe para exemplificar o uso do static em variaveis e metodos, este modificador permite que a variavel ou o metodo
 * se torne global, ou seja, pertenca a classe e nao aos objetos instanciados 
 * @author Marcos Ribeiro
 */

public class Galinha {
	
	public int ovos; //total de ovos do objeto galinha
	public static int ovosDaGranja; //variavel global, criada uma unica vez, pertence a classe toda
	
	public Galinha botar() { //fazendo o metodo retornar o proprio objeto
		this.ovos++;
		Galinha.ovosDaGranja++; //cada vez que um objeto executar esse metodo, o valor sera incrementado na variavel
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

}
