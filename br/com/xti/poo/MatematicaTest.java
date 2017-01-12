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
		
		double somarValores = m.somaIlimitado(2, 3, 5, 6, 7);
		System.out.println(somarValores);
		
		// raiz quadrada aproximada, utilizando equacao de Pell
		int raiz = m.raiz(276);
		System.out.println(raiz);
		
		//raiz quadrada com maior precisao, utilizando a classe Math.sqrt
		System.out.println(Math.sqrt(276));

	}

}
