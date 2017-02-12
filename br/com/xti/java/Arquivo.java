package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe que apresenta os conceitos de criacao, leitura e escrita em arquivos pequenos
 * Para o exemplo apresentado abaixo, criamos um diretorio e um arquivo txt com o texto "Meu texto"
 * @author Marcos Ribeiro
 */

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		//Primeiro passo eh definir o caminho do arquivo (mesmo que ainda nao exista)
		//A classe Path juntamente com o metodo get da classe Paths sao responsaveis por definir o caminho de um arquivo
		//O metodo gets recebe uma string contendo o caminho completo ate um arquivo desejado
		Path path = Paths.get("C:/Users/Markinho/Java/XTI/files/texto.txt");
		
		System.out.println(path.toAbsolutePath());//caminho absoluto (completo) da localizao do arquivo
		
		System.out.println(path.getParent());//caminho onde esta localizado o direto que armazena o arquivo informado na variavel path
		
		System.out.println(path.getRoot());//caminho da raiz onde esta localizado o arquivo informado na variavel path
		
		System.out.println(path.getFileName());//nome do arquivo informado na variavel path
		
		/**CRIAR DIRETORIO QUE IRA ARMAZENAR O ARQUIVO*/
		
		//Utiliza o metodo createDirectories() da classe File
		//Nesse metodo eu informo o caminho ate o diretorio que ira conter o arquivo
		//Passei como parametro o resultado do metodo getParent que eh exatamente a informacao que preciso
		Files.createDirectories(path.getParent());
		
		/**CRIAR E ESCREVER EM ARQUIVOS*/
		
		//Vou usar o metodo write da classe File
		//Esse metodo cria um novo arquivo (caso este ja nao exista)
		//Limpa o arquivo caso  esse exista
		//Escreve os dados em bytes no arquivo
		//Fecha o arquivo
		//Como ele recebe no parametro um caminho usando path e os bytes, eh necessario converter o texto em bytes
		//Usei o metodo getBytes que transforma um texto em um array de bytes e ja armazenei o resultado em um array de bytes
		
		byte[] bytes = "Meu texto".getBytes();//convertendo um texto em bytes e ja armazenando o resultado em um array de bytes
		
		Files.write(path, bytes);//criando o arquivo que recebe o caminho usando minha variavel path e os bytes para gravacao
		
		/**LER O CONTEUDO DE UM ARQUIVO*/
		
		//Utilizo o metodo readAllBytes da classe File
		//O metodo recebe como parametro um caminho de arquivo
		//E retorna um array de bytes
		
		byte[] conteudo = Files.readAllBytes(path);//executando o metodo readAllBytes passando como parametro o caminho do meu arquivo criado, em seguida ja salvo o array de bytes de resultado numa variavel chamada conteudo
		
		System.out.println(new String (conteudo));//imprimindo o conteudo em formato de string

	}

}
