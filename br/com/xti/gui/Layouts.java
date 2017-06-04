package br.com.xti.gui;

//import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe criada para apresentar duas formas de layout para container: BorderLayout e FlowLayout
 * BorderLayout: Posso adicionar componentes em qualquer uma das 5 direcoes disponiveis, NORTH, SOUTH, EAST e WEST
 * FlowLayout: Eh mais simples, basicamente adiciono componentes que sao exibidos um ao lado do outro conforme foram adicionados
 * @author Marcos Ribeiro
 */

public class Layouts extends JFrame {
	
	public Layouts() {//construtor da classe Layouts
		
		super("Layouts");//construtor da classe JFrame
		
		Container c = getContentPane();//atribuindo o container padrao a uma variavel
		
		/**
		
		Exemplo de como utilizar o BorderLayout adicionando um componente em cada direcao
		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		
		*/
		
		c.setLayout(new FlowLayout());//definindo que o layout padrao sera o FlowLayout
		c.add(new JButton("1"));//adicionando botao ao container
		c.add(new JButton("2"));//adicionando botao ao container
		c.add(new JButton("3"));//adicionando botao ao container
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar programa ao clicar em fechar
		setSize(300, 300);//largura e altura da janela
		setVisible(true);//janela visivel
	}

	public static void main(String[] args) {
		
		new Layouts();//chamando a classe Layouts

	}

}
