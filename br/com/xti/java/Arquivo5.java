package br.com.xti.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe criada para apresentar os objetos que armazenam informacoes da maquina do usuario, sendo estas informacoes:
 * Raizes e conteudos de diretorios da maquina e informacoes das particoes da maquina (unidade, espaco disponivel, espaco utilizado, etc)
 * @author Marcos Ribeiro
 */

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		/**LISTAR A RAIZ DE DIRETORIOS DA MAQUINA*/
		
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();//usando metodos da classe FileSystems para retornar os diretorios raiz da minha maquina
		for (Path path : dirs) {//for each para percorrer e imprimir cada um dos diretorios raiz
			System.out.println(path);
		}
		
		/**LISTAR O CONTEUDO DE UM DIRETORIO*/
		
		Path dir = Paths.get("C:/Users/Markinho/Java/XTI");//caminho que sera listado
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {//utilizando metodos da classe file para criar um objeto que armazena os nomes dos diretorios e arquivos contidos no path declarado
			for (Path path : stream) {//for each para percorrer e imprimir o conteudo do objeto stream
				System.out.println(path.getFileName());
			}
		} catch(IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
		
		/**PARTICOES*/
		
		FileSystem fs = FileSystems.getDefault();//objeto para realizar as operacoes de arquivos e informacoes do sistema
		for(FileStore store: fs.getFileStores()) {//utilizando o metodo getFileStores temos como retorno um objeto que pode ser percorrido com for, esse objeto armazena em cada item as informacoes de cada uma das particoes da maquina
			System.out.println("Unidade: " + store.toString());
			System.out.println("Tamanho total: " + store.getTotalSpace());
			System.out.println("Espaço Disponivel: " + store.getUsableSpace());
			System.out.println("Espaço Utilizado: " + (store.getTotalSpace() - store.getUsableSpace()));
			System.out.println();
		}
	}
}
