/**
 *Desafio: Jogo que pessoa da um palpite sobre um numero (0-6) e o programa retorna se a pessoa acertou ou errou
 *Utilizando a classe JOptionPane
 *@author Marcos Ribeiro
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class DesafioDadosJOptionPane {
 
	public static void main (String[] args) {
		
		Random r = new Random();
		
		int numeroDado = r.nextInt(6) + 1;
		
		String dado = JOptionPane.showInputDialog("Favor digitar um numero do dado (de 1 ate 6)");
		
		int palpite = Integer.parseInt(dado);
		if (palpite == numeroDado) {
			JOptionPane.showMessageDialog(null, "Parabens ... Voce acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena ... Voce errou o valor correto era " + numeroDado);
		}
	
	}
}