package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe criada para apresentar o recurso JComboBox e criar um album que exibe 4 imagens
 * @author Marcos Ribeiro
 */

public class ControleCombo extends JFrame implements ItemListener {
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/1.jpg")),
			new ImageIcon(getClass().getResource("fotos/2.png")),
			new ImageIcon(getClass().getResource("fotos/3.png")),
			new ImageIcon(getClass().getResource("fotos/4.png"))
	};
	
	public ControleCombo( ) {
		super("Album de Fotos");
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Trinit");
		combo.addItem("Neo");
		combo.addItem("Codigo");
		combo.addItem("Final");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setSize(300,530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
		new ControleCombo();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
