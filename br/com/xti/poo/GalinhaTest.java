package br.com.xti.poo;

/**
 * Classe para exemplificar e testar o uso do static em variaveis e metodos, este modificador permite que a variavel ou o metodo
 * se torne global, ou seja, pertenca a classe e nao aos objetos instanciados
 * @author Marcos Ribeiro
 */

public class GalinhaTest {

	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
		
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaDeOvos(2));
	}

}
