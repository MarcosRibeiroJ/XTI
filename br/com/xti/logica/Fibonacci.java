package br.com.xti.logica;
/**
 * Exercicio para imprimir a sequencia de Fibonacci
 *@author Marcos Ribeiro
 */

public class Fibonacci {

	public static void main (String[] args) {
	
		int i = 1;
		int aux = 0;
		
		for(int j = 0; j < 50; j = aux){
			System.out.print(j + "  ");
			aux = i + j;
			i = j;
		}
		
	}

}