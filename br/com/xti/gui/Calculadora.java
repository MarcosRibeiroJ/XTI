package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe criada para apresentar o layout de uma calculadora usando a classe swing
 * @author Marcos Ribeiro
 */

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	public Calculadora() {
		super("Calculadora");
		
		Container n = new JPanel();
		n.setLayout(new GridLayout(4,4,5,5));
		n.add(new JButton("7"));
		n.add(new JButton("8"));
		n.add(new JButton("9"));
		n.add(new JButton("/"));
		n.add(new JButton("4"));
		n.add(new JButton("5"));
		n.add(new JButton("6"));
		n.add(new JButton("*"));
		n.add(new JButton("1"));
		n.add(new JButton("2"));
		n.add(new JButton("3"));
		n.add(new JButton("-"));
		n.add(new JButton("0"));
		n.add(new JButton("."));
		n.add(new JButton("="));
		n.add(new JButton("+"));
		
		JTextField display = new JTextField();
		display.setFont(new Font("serif", Font.PLAIN, 26));
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, n);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Calculadora();

	}

}
