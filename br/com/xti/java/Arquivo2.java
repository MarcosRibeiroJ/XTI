package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Basicamente temos dois tipos de gravacao de arquivos: Streams de Bytes e Streams de Caracteres
 * Streams de Bytes sao gravacoes de arquivos com conteudo de dados que humanos nao podem ler, tais como videos, musicas e imagens
 * Streams de Caracteres sao gravacoes de arquivos com conteudo de dados que humanos podem ler, tais como textos ou codigos fonte
 * Nessa classe apresentaremos conceitos de Streams de Caracteres, mais especificamente de BufferedWriter e BufferedReader
 * Ambos sendo recursos de gravacao e leitura de arquivos usando Buffer 
 * Buffer eh um deposito de dados na memoria do computador, quando utilizamos esse metodo para gravacao
 * Os dados ficam armazenados nessa memoria temporaria ate serem gravados, podemos utilizar para fazer varias gravacoes num mesmo arquivo
 * @author Marcos Ribeiro
 */

public class Arquivo2 {

	public static void main(String[] args) {
		
		//Primeiro passo eh definir o caminho do arquivo (mesmo que ainda nao exista)
		//A classe Path juntamente com o metodo get da classe Paths sao responsaveis por definir o caminho de um arquivo
		//O metodo gets recebe uma string contendo o caminho completo ate um arquivo desejado
		
		Path path = Paths.get("C:/Users/Markinho/Java/XTI/files/texto.txt");
		
		/**ESCREVER NO ARQUIVO*/
		
		//Para escrever no arquivo vamos usar o metodo BufferedWriter que recebe um caminho de arquivo e o padrao de formatacao do mesmo
		//Esse padrao pode ser UTF_16, UTF_8, ASCII, etc
		//Para definir o padrao criamos um objeto do tipo Charset e armazenamos nele o resultado da Classe StandardCharsets
		
		Charset utf8 = StandardCharsets.UTF_8;//criacao do objeto que define o padrao de formatacao
		
		
		//Criamos um objeto do tipo BufferedWriter que sera usado para escrever informacoes no arquivo
		//Esse objeto recebe o resultado do metodo newBufferedWriter quando passamos como parametro o caminho do arquivo e a formatacao padrao do texto
		//Como podemos ter um erro do tipo IOException, incluimos a criacao do objeto dentro de uma estrutura try catch
		//Nesse modelo o try vai tentar uma conexao para escrever no arquivo e caso for possivel fara:
		//Escrever duas linhas que ficam armazenadas na memoria temporaria do computador (Buffer)
		//Gravar os dados usando o metodo flush() que esta comentado pq ao fechar a conexao os dados sao automaticamente gravados
		//Caso formos gravar uma quantidade grande de informacao, eh interessante chamar o metodo flush de tempos em tempos para nao correr risco de perder os dados
		//Esta comentado a linha que fecha automaticamente  a conexao ao termino da gravacao dos dados, nas versoes antigas do Java era necessario fechar manualmente a conexao
		//Caso queira saber se uma classe possui fechamento de conexao automatico abra o arquivo fonte da classe segurando CTRL e clicando no nome da classe
		//Procure por uma propriedade chamada Closeable que se nao estiver na classe imediata pode estar na classe pai
		
		try(BufferedWriter escrever = Files.newBufferedWriter(path, utf8)) {
			escrever.write("Primeiro texto\r\n");
			escrever.write("Segundo texto");
			//escrever.flush();
		} catch(IOException e) {
			e.printStackTrace(); //Imprime erro caso aconteca
		} //finally {
			//if(escrever != null) {
			//	escrever.close();
			//}
		//}
		
		
		/**LER DADOS DO ARQUIVO*/
		
		//Criamos um objeto do tipo BufferedReader que sera usado para ler informacoes no arquivo
		//Esse objeto recebe o resultado do metodo newBufferedReader quando passamos como parametro o caminho do arquivo e a formatacao padrao do texto
		//Como podemos ter um erro do tipo IOException, incluimos a criacao do objeto dentro de uma estrutura try catch
		//Nesse modelo o try vai tentar uma conexao para ler o conteudo do arquivo
		//Caso consiga ele executa um laco de repeticao que vai ler linha a linha o conteudo do arquivo imprimindo o mesmo
		//Caso nao consiga ler o conteudo ele ira imprimir o erro
		//Essa classe tambem possui o fechamento automatico de conexao com a propriedade Closeable mencionada acima
		
		try(BufferedReader ler = Files.newBufferedReader(path, utf8)) {
			String linha = null;
			while((linha = ler.readLine()) != null) {
				System.out.println(linha);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}//fim main

}//fim da classe
