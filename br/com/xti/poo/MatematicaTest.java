package br.com.xti.poo;

/**
 * Classe para testar a classe Matematica
 * @author Marcos Ribeiro
 */

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();//instanciando um objeto da classe Matematica
		
		double soma = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(soma);

	}

}
