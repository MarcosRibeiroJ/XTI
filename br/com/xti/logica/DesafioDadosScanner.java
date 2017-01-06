package br.com.xti.logica;
/**
 *Desafio: Jogo que pessoa da um palpite sobre um numero (0-6) e o programa retorna se a pessoa acertou ou errou
 *Utilizando a classe Scanner
 *@author Marcos Ribeiro
 */

import java.util.Scanner;
import java.util.Random;

public class DesafioDadosScanner {
 
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int numeroDado = r.nextInt(6) + 1;
		
		System.out.println("*** Jogo do Palpite ***\n\n");
		System.out.println("Favor digitar um numero do dado (de 1 ate 6): ");
		int palpite = s.nextInt();
		if (palpite == numeroDado) {
			System.out.println("Parabens ... Voce acertou!!");
		} else {
			System.out.println("Que pena ... Voce errou o valor correto era " + numeroDado);
		}
	
	}
}