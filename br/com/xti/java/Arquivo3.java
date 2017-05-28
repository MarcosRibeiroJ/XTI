package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

/**
 * Classe criada para resolver o desafio da aula 64 que consiste em criar um programa que:
 * Tenha um metodo para receber uma quantidade de contas e grava-las em um txt
 * Tenha um metodo que consiga ler os dados de um arquivo txt e armazena-los novamente em um novo objeto
 * Essa resolucao eh a do curso XTI, a minha esta armazenada em um repositorio separado
 * @author Marcos Ribeiro
 */

public class Arquivo3 {
	
	private Path path = Paths.get("C:/Users/Markinho/Java/XTI/files/contas.txt");//caminho do arquivo
	private Charset utf8 = StandardCharsets.UTF_8;//tipo de formatacao

	//Metodo que grava as contas em um txt
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		
		//Criado objeto para gravar em txt
		//Usando um for each o metodo percorre o array de contas, recupera os valores do objeto e grava no txt usando ; como separador
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (Conta conta : contas) {
				writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
			}
		}
	}// fim do metodo de gravar contas
	
	//Metodo que le os dados de um txt
	//Separa esses dados e cria um novo objeoto passando esses dados como parametro
	public ArrayList<Conta> recuperarContas() throws IOException {
		ArrayList<Conta> contas = new ArrayList<>();//criando um array para armazenar os dados lidos
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) {//criando um objeto para ler dados
			String line = null;//como o metodo le as linhas do txt, aqui estou armazenando em uma string a linha lida
			while((line = reader.readLine()) != null) {//enquanto a linha for diferente de nula continuar lendo
				String[] t = line.split(";");//salva em uma string os dados ja separando os mesmos pelo ;
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));//armazena em um novo objeto os dados lidos, ja transformando um dos dados de string para double
				contas.add(conta);//adiciona os objetos no array
			}
		}
		return contas;//retorna o array
	}
	
	public static void main(String[] args) throws IOException {
		
		/*Criacao do array de contas
		 
		Esse trecho esta comentado para testar se quando alterar diretamente no arquivo de texto
		O metodo recuperarContas consegue ler essas alteracoes e criar um novo ArrayList de contas com as novas informacoes
		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));
		
		*/
		
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();//crio um laco que usa o priprio metodo da classe conta para exibir os dados de cada objeto do array
		}
	}

}
