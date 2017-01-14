package br.com.xti.poo;

/**
 * Classe criada para exemplificar os Enum (lista contendo um conjunto de constantes) 
 * @author Marcos Ribeiro
 */

public class EnumTest {
	
	//Constante deve ser criada fora de todos os metodos, com static para garantir q sera global e final para garantir q sera unica
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
		//Imprimindo a constante PI
		System.out.println(PI);
		
		//Imprimindo um elemento da constante enum PecasXadrez
		System.out.println(PecasXadrez.PEAO);
		
		//Imprimindo um elemento da constante enum Medida
		System.out.println(Medida.M);
		
		//Imprimindo um parametro da constante enum Medida
		System.out.println(Medida.M.titulo);
		
		//Imprimindo todos os elementos (juntamente com seus parametros) de uma constante enum
		for(Medida m : Medida.values()) { //metodo values() transforma os elementos de uma enum em um array
			System.out.println(m + ": " + m.titulo);
		}

	}

}
