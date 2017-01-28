package br.com.xti.erros;

/**
 * Classe criada para exemplificar o uso dos comandos de tratamento de erro:
 * try: Tenta executar um comando e toma uma decisao em caso erro
 * catch: Especifico o que sera feito em caso de erro
 * finally: estrutura que sera executada independente do programa apresentar erro ou nao
 * System.err apresenta mensagem de erro em cor vermelha pra destacar
 * Multi catch: Utilizado quando quero tratar em um mesmo catch mais de uma mensagem de erro
 * StackTrace: Rastrear o caminho do erro ate a classe que ele pertence
 * Throws: Indica quais tipos de erro um metodo pode gerar
 * @author Marcos Ribeiro
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {//acrescentei os dois erros que o metodo pode gerar
		System.out.print("Digite um numero: ");
		int a = s.nextInt();
		System.out.print("Digite um divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				dividir(s);				
				continua = false;
			}
			//Erro: Digitar texto em campo numerico e Tentar dividir um numero por zero
			catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Numero Invalido");
				e1.printStackTrace();//metodo para imprimir o caminho do erro ate a classe que ele pertence
				s.nextLine();//descarta a entrada errada e libera novamente o scanner para o usuario 
			}
			finally {
				System.out.println("\nFinally Executado ...");
			}
			
		} while(continua);
		

	}//fim main

}//fim classe
