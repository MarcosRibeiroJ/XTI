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
		
		// raiz quadrada aproximada, utilizando equacao de Pell
		int raiz = m.raiz(276);
		System.out.println(raiz);
		
		//raiz quadrada com maior precisao, utilizando a classe Math.sqrt
		System.out.println(Math.sqrt(276));
		
		//metodo de soma com quantidade ilimitada de argumentos
		double somarValores = m.somaIlimitado(2, 3, 5, 6, 7);//
		System.out.println(somarValores);
		
		//metodo media com inteiros (sobrecarga I)
		System.out.println(m.media(5, 3));
		
		//metodo media com Strings (sobrecarga II)
		System.out.println(m.media("50", "30"));
		
		//metodo media com um inteiro (sobrecarga III)
		System.out.println(m.media(50));
		
		//metodo media com uma quantidade ilimitada de doubles (sobrecarga IV)
		System.out.println(m.media(1, 2, 3));

	}

}
