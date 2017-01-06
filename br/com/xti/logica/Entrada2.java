package br.com.xti.logica;
/**
 *Recuperar de dados que o usuario digita utilizando a classe JOptionPane
 *@author Marcos Ribeiro
 */

import javax.swing.JOptionPane;

 public class Entrada2 {
	
	public static void main (String[] args){
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, "Bem Vindo " + nome + "!");
	}
}