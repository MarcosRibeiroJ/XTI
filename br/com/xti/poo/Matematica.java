package br.com.xti.poo;

/**
 * Classe com operacoes basicas de matematica
 * @author Marcos Ribeiro
 */

public class Matematica {
	
	/**
	 * Metodo para identificar o maior entre dois numeros
	 * @param um
	 * @param dois
	 * @return o maior entre dois numeros
	 */
	int maior(int um, int dois) {
		if(um > dois){
			return um;
		} else {
			return dois;
		}
	}
	
	double soma(double um, double dois) {
		return um + dois;
	}

}
