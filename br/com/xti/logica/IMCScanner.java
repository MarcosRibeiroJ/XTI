package br.com.xti.logica;
/**
 *Calcular o IMC (Indice de Massa Comporal)
 *IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 *@author Marcos Ribeiro
 */

import java.util.Scanner;
 
public class IMCScanner {
	
	public static void main (String[] args){
	
		Scanner s = new Scanner(System.in);
		System.out.println("*** Sistema de calculo de IMC ***\n");
		System.out.println("\nDigite seu peso: ");
		double peso = s.nextDouble();
		System.out.println("\nDigite sua altura: ");
		double altura = s.nextDouble();
		
		double imc = peso / (altura * altura);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
		
		System.out.println("\nResultado do IMC: " + msg);
	}

} 