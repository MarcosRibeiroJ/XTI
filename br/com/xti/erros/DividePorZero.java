package br.com.xti.erros;

/**
 * Classe criada para exemplificar o uso dos comandos de tratamento de erro:
 * try: Tenta executar um comando e toma uma decisao em caso erro
 * catch: Especifico o que sera feito em caso de erro
 * finally: estrutura que sera executada independente do programa apresentar erro ou nao
 * System.err apresenta mensagem de erro em cor vermelha pra destacar
 * @author Marcos Ribeiro
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				
				System.out.print("Digite um numero: ");
				int a = s.nextInt();
				System.out.print("Digite um divisor: ");
				int b = s.nextInt();
				
				System.out.println(a / b);
				continua = false;
			}
			//Erro: Digitar texto em campo numerico
			catch(InputMismatchException e1) {
				System.err.println("Favor digitar numeros inteiros");
				s.nextLine();//descarta a entrada errada e libera novamente o scanner para o usuario 
			}
			//Erro: Tentar dividir um numero por zero
			catch(ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de zero");
				s.nextLine();//descarta a entrada errada e libera novamente o scanner para o usuario
			}
			finally {
				System.out.println("\nFinally Executado ...");
			}
			
		} while(continua);
		

	}//fim main

}//fim classe
