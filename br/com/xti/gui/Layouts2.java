package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe criada para apresentar o layout para container GridLayout
 * Nesse programa configurei espacamento entre elementos de um BorderLayout,
 * Defini um GridLayout,
 * Criei uma janela contendo uma mistura de BorderLayout e GridLayout
 * @author Marcos Ribeiro
 */

public class Layouts2 extends JFrame {
	
	public Layouts2() {
		
		super("Layouts");//construtor da classe JFrame
		
		Container c = getContentPane();//atribuindo o container padrao a uma variavel
		
		Container c2 = new JPanel();//criando um segundo container do tipo JPanel
		c2.setLayout(new GridLayout(4, 1));//definindo que este container sera do tipo GridLayout com 4 linhas e 1 coluna
		c2.add(new JButton("OK"));//adicionando botao
		c2.add(new JButton("Cancel"));//adicionando botao
		c2.add(new JButton("Setup..."));//adicionando botao
		c2.add(new JButton("Help"));//adicionando botao
		
		c.setLayout(new BorderLayout());//definindo o layout do container principal como BorderLayout
		c.add(BorderLayout.CENTER, new JButton("Centro"));//adicionando botao ao centro
		c.add(BorderLayout.EAST, c2);//adicionando o outro container na posicao EAST
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar programa ao fechar a janela
		setSize(300, 300);//largura e altura da janela
		setVisible(true);//janela visivel
		
		/**
		
		BorderLayout com botoes adicionados
		
		c.setLayout(new BorderLayout(15, 15));//definindo o layout padrao como BorderLayout com espacamento de 15 pixels (vertical, horizontal) entre os componentes adicionados
		
		c.add(BorderLayout.NORTH, new JButton("N"));//adicionando botao
		c.add(BorderLayout.SOUTH, new JButton("S"));//adicionando botao
		c.add(BorderLayout.CENTER, new JButton("C"));//adicionando botao
		c.add(BorderLayout.EAST, new JButton("E"));//adicionando botao
		c.add(BorderLayout.WEST, new JButton("W"));//adicionando botao
		
		GridLayout com botoes adicionados
		
		c.setLayout(new GridLayout(2, 3));////definindo o layout padrao como GridLayout com 2 linhas e 3 colunas
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
	}

	public static void main(String[] args) {
		
		new Layouts2();//chamando a classe Layouts2

	}

}
