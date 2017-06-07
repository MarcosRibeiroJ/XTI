package br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Classe criada para apresentar um exemplo de utilizacao de JTextField e JPasswordField numa tela que simula um login de usuario
 * Ao clicar no botao ok uma tela exibe o nome de usuario e senha digitados e ao clicar no botao cancel, os campos para o usuario digitar sao limpos
 * Essa classe utiliza o conceito de classes internas para tratar o listener de cada botao
 * @author Marcos Ribeiro
 */

public class ControleText extends JFrame {
	
	JButton ok, cancel;//delarando os botoes como atributos da classe
	JTextField login;//declarando JTextField como atributo da classe
	JPasswordField senha;//declarando JPasswordField como atributo da classe
	
	public ControleText() {
		
		super("Textos e Senhas");//construtor da classe JFrame
		
		login = new JTextField();//instanciando o JTextField
		senha = new JPasswordField();//instanciando o JPasswordField
		
		ok = new JButton("Ok");//instanciando o botao ok
		ok.addActionListener(new BotaoOkListener());//definindo que o Listener esta declarado em uma classe interna chamada BotaoOkListener
		
		cancel = new JButton("Cancel");//instanciando o botao cancel
		cancel.addActionListener(new BotaoCancelListener());//definindo que o Listener esta declarado em uma classe interna chamada BotaoCancelListener
		
		Container c = getContentPane();//atribuindo o container padrao a uma variavel
		c.setLayout(new GridLayout(3, 2));//definindo o layout do container
		c.add(new JLabel("Login: "));//adicionando uma label
		c.add(login);//adicionando uma JTextField
		c.add(new JLabel("Senha: "));//adicionando uma label
		c.add(senha);//adicionando um JPasswordField
		c.add(ok);//adicionando o botao ok
		c.add(cancel);//adicionando o botao cancel
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerra o programa quando fechar a janela
		setSize(300, 300);//tamanho da janela
		setVisible(true);//janela visivel
	}

	public static void main(String[] args) {
		
		new ControleText();//chamando a classe ControleText

	}
	
	//criando uma classe interna somente para tratar o listener do botao ok
	class BotaoOkListener implements ActionListener { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String s = "login: " + login.getText() + "\nsenha: " + new String(senha.getPassword());//criar uma string contendo o nome de usuario e a senha
			JOptionPane.showMessageDialog(null, s);//exibir essa mensagem em um JOptionPane
		}
	}
	
	//criando uma classe interna somente para tratar o listener do botao cancel
	class BotaoCancelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");//limpar o JTextField atribuindo um texto vazio
			senha.setText("");//limpar o JPasswordField atribuindo um texto vazio
		}
	}
	
}
