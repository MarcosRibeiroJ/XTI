package br.com.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Marcos Ribeiro
 */

public class ControleLabel extends JFrame {
	
	public ControleLabel() {
		super("Label");//construtor da classe JFrame
		
		/**Criando uma label simples*/
		
		JLabel simples = new JLabel("Label Simples");//criando uma label com um texto
		simples.setToolTipText("Meu Tooltip");//definindo uma mensagem (tooltip) que sera exibida colocando o mouse em cima do label
		
		/**Criando uma label formatada*/
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);//criando um objeto do tipo font e definindo: a familia da fonte, negrito, italico e tamanho 28
		
		JLabel label = new JLabel("Label Simples");//criando uma label com um texto
		label.setFont(fonte);//atribuindo o objeto font a label
		label.setForeground(Color.BLUE);//definindo a cor usando setForeground e escolhendo uma cor atraves da classe Color
		
		/**Criando uma label com uma imagem*/
		
		/* A imagem sera um objeto do tipo ImageIcon, passo como parametro para o construtor
		 o metodo getClass que retorna o endereco da classe ControleLabel e uso tambem
		 o metodo getResource que procura a posicao de um arquivo no caminho indicado ou nas proximidades
		 depois basta adicionar o objeto do tipo ImageIcon ao construtor do JLabel*/
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/lampada.png"));
		
		JLabel imagem = new JLabel(icon);
		
		/**Adicionando a label ao container*/
		
		Container c = getContentPane();//atribuindo o container padrao a uma variavel
		c.setLayout(new FlowLayout());//definindo o layout do container
		c.add(simples);//adicionando a label simples ao container
		c.add(label);//adicionando a label formatada ao container		
		c.add(imagem);//adicionando a label com imagem
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar programa quando fechar janela
		setSize(300, 300);//largura e altura da janela
		setVisible(true);//janela visivel
	}

	public static void main(String[] args) {
		
		new ControleLabel();//chamando a classe ControleLabel

	}

}
