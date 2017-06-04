package br.com.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe criada para apresentar os conceitos iniciais de interface do usuario (GUI)
 * Nesse programa criei uma janela extendendo da classe JFrame e defini algumas de suas configuracoes,
 * Dentro da janela adicionei um container e dentro deste um botao
 * @author Marcos Ribeiro
 */

public class Janela extends JFrame{

	public Janela() {//construtor da classe Janela
		
		super("Minha Janela");//a classe Janela esta herdando da classe JFrame, nesse caso estou usando o construtor da classe JFrame e ja passando como parametro o nome da janela
		
		JButton botao = new JButton("Clique");//objeto para o botao
		
		getContentPane().add(botao);//recupera o container (divisoria para armazenar componentes na janela) padrao da janela, nesse caso ja estou adicionando dentro do container o botao criado 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//definindo que ao clicar em fechar sera encerrado o programa
		setSize(300, 300);//definindo a largura e altura da janela (em pixels)
		setVisible(true);//definindo a visibilidade da janela
		
	}
	
	public static void main(String[] args) {
		
		new Janela();//chamando o construtor da classe Janela

	}

}
