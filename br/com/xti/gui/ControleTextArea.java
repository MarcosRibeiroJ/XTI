package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Classe criada para apresentar os recursos JTextArea e JFileChooser
 * @author Marcos Ribeiro
 */

public class ControleTextArea extends JFrame implements ActionListener{
	
	JTextArea texto;
	
	public ControleTextArea() {
		
		//definindo configuracoes da janela
		super("Editor de Textos");
		
		//declarando e formatando JTextArea
		texto = new JTextArea();
		
		//declarando JScrollPane para a barra de rolagens
		JScrollPane scroll = new JScrollPane(texto);
		
		//formatando fonte do JTextArea
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		//criando um botao para abrir arquivos de texto
		JButton botao = new JButton("Abri arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		//capturando container para adicionar os componentes
		Container c = getContentPane();
		
		//adicionando o componente no container
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new ControleTextArea();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//classe que instancia um objeto que pode selecionar arquivos no computador
		JFileChooser c = new JFileChooser();
		
		//metodo para abrir uma janela capaz de selecionar um arquivo
		c.showOpenDialog(this);
		
		//metodo que retorna um arquivo selecionado
		File file = c.getSelectedFile();
		
		//manipulando a leitura do arquivo e tratando os erros possiveis ao carregar o arquivo
		try {
			//capturando o caminho do arquivo selecionado
			Path path = Paths.get(file.getAbsolutePath()); 
			
			// lendo todo conteudo do arquivo e guardando numa string
			String conteudo = new String(Files.readAllBytes(path));
			
			//definindo que o texto do JTextArea sera o conteudo armazenado na string
			texto.setText(conteudo);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Erro ao carregar o arquivo");
		}
	}

}
