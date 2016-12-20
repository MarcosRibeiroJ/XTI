/**
 *Calcular o IMC (Indice de Massa Comporal)
 *IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 *@author Marcos Ribeiro
 */

import javax.swing.JOptionPane;
 
public class IMCJOptionPane {
	
	public static void main (String[] args){
		
		String textoPeso = JOptionPane.showInputDialog("Digite seu peso");
		String textoAltura = JOptionPane.showInputDialog("Digite sua altura");
		
		double peso = Double.parseDouble(textoPeso);
		double altura = Double.parseDouble(textoAltura);
				
		double imc = peso / (altura * altura);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
		
		JOptionPane.showMessageDialog(null, "\nResultado do IMC: " + msg);
	}

} 