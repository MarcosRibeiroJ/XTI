package br.com.xti.logica;
/**
 *Recuperar de dados que o usuario digita utilizando a classe Scanner
 *@author Marcos Ribeiro
 */

import java.util.Scanner;

 public class Entrada {
	
	public static void main (String[] args){
		
		//Recuperando os dados na chamada do metodo (nesse caso do metodo main)
		//System.out.println(args[0]);
		
		//Interagindo com o usuario
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem Vindo " + nome + "!");
	}
}