package br.com.xti.erros;

/**
 * Classe criada para apresentar os conceitos de debug
 * @author Marcos Ribeiro
 */

public class DebugExemplo {
	
	int resultado;
	
	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}

	public static void main(String[] args) {
		
		int numero = 16;
		DebugExemplo exemplo = new DebugExemplo();
		int raiz = exemplo.raiz(numero);
		
		if(raiz == 4) {
			System.out.println("Raiz Correta");
		}
		

	}

}
