package br.com.xti.erros;

import java.util.Scanner;

/**
 * Classe criada para apresentar as assertions (verificacao feita em tempo de desenvolvimento)
 * Uma assertion nunca deve acontecer, sendo um erro que nao eh tratado (como no caso das exceptions)
 * Ela eh utilizada somente enquanto o desenvolvedor cria o programa, para que este verifique possiveis erros que nao deverao acontecer com o usuario final do programa. Nao deve constar no codigo da versao de producao do sistema
 * Por padrao ela vem desabilitada na execucao, para executar um programa com assertion habilitada, no prompt digite o comando java -ea nome_classe ou java -da nome_classe para desabilitar a assertion
 * No eclipse para habilitar uma assertion clique no menu "Run/Run Configurations" e na guia "arguments" digite -ea
 * @author Marcos Ribeiro
 */

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 10: ");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "Numero Invalido: " + numero;//verificacao para o caso de numero fora do parametro definido
		System.out.println("Voce digitou o numero: " + numero);

	}

}
