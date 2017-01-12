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
	
	/**@return raiz quadrada aproximada, utilizando equacao de Pell*/
	int raiz(int num) {
		int i = 0;
		for (int j = 1; j <= num; j++) {
			if (j % 2 == 1) {
				num -= j;
				i++;
            }
        }
		return i;
	}
	
	
	//metodo de soma com quantidade ilimitada de argumentos
	double somaIlimitado(double ... numeros) {
		double total = 0;
		for(double numero : numeros) {
			total += numero;
		}
		return total;
	}
	
	
	//metodo de media com dois inteiros de argumentos (sobrecarga I)
	double media(int x, int y) {
		System.out.print("media(int x, int y) ");
		return (x + y) / 2;
	}
	
	
	//metodo de media com duas Strings de argumentos (sobrecarga II)
	double media(String x, String y) {
		System.out.print("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	
	//metodo de media com um inteiro de argumento (sobrecarga III)
	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
	//metodo de media com numero ilimitado de doubles como argumento (sobrecarga IV)
	double media(double ...x ) {
		System.out.print("media(double ...x ) ");
		return this.somaIlimitado(x) / x.length; //chamando o metodo somaIlimitado que ja existe na classe Matematica
	}

}//fim da classe
