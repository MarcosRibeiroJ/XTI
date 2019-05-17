package br.com.xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Classe criada para apresentar o recurso de checkbox da biblioteca swing
 * @author Marcos Ribeiro
 */

public class ControleCheck extends JFrame {
	
	JTextField texto;
	JCheckBox bold, italic;

	public ControleCheck() {
		super();
		
		//criando o campo de texto
		texto = new JTextField("Veja a fonte mudar",12);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		//criando os checkbox
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		
		//adicionando os listeners dos checkbox
		bold.addItemListener(new CheckListener());
		italic.addItemListener(new CheckListener());
		
		//adicionando container
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		//definindo as configuracoes da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}
	
	//criando a classe que fara a formatacao da fonte
	class CheckListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			} else if(bold.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD, 26));
			} else if(italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			} else {
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
			}	
		}
	}
	
	public static void main(String[] args) {
		
		new ControleCheck();
	}

}
