package br.com.xti.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe que apresenta o conceito de programar eventos em botoes definindo seus listeners
 * @author Marcos Ribeiro
 */

public class Eventos extends JFrame implements ActionListener {//classe que herda da classe JFrame e implementa a interface ActionListener
	
	JButton botao;//declarando o botao como um atributo da classe, para poder ser acessado por qualquer metodo da classe
	
	public Eventos() {
		
		super("Eventos");//construtor da classe JFrame
		
		botao = new JButton("Clique Aqui");//criando um botao
		botao.addActionListener(this);//adicionando o recurso que ira ouvir (listener) a acao do botao e informando que a classe principal "this" ira tratar o evento do botao
		getContentPane().add(botao);//adicionando o botao ao container padrao da janela
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar programa quando fechar janela
		setSize(300, 300);//largura e altura da janela em pixels
		setVisible(true);//janela visivel
	}

	public static void main(String[] args) {
		
		new Eventos();//chamando a classe Eventos

	}

	@Override
	public void actionPerformed(ActionEvent e) {//metodo que sera executado qndo botao for clicado
		
		botao.setText("Foi clicado");//quando o botao for clicado, seu texto devera ser alterado
		
	}

}
