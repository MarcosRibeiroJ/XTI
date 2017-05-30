package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Classe criada para apresentar operacoes basicas com arquivos e diretorios sendo estas:
 * Verificar informacoes, Excluir, Criar, Escrever, Copiar e Mover
 * @author Marcos Ribeiro
 */

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/Users/Markinho/Java/XTI/files/texto.txt");
		Path path2 = Paths.get("C:/Users/Markinho/Java/XTI/files/fonte.txt");
		
		/**VERIFICANDO INFORMACOES DE ARQUIVOS E DIRETORIOS*/
		
		System.out.println(Files.exists(path));//verifica se o caminho existe
		System.out.println(Files.isDirectory(path));//verifica se o caminho aponta para um diretorio
		System.out.println(Files.isRegularFile(path));//verifica se eh um arquivo regular (arquivos de texto, imagens, etc)
		System.out.println(Files.isReadable(path));//verifica na permissao do arquivo se este pode ser lido pelo usuario da maquina
		System.out.println(Files.isExecutable(path));//verifica na permissao do arquivo se este pode ser executado pelo usuario da maquina
		System.out.println(Files.size(path));//verifica o tamanho do arquivo (esse metodo gera uma IOException)
		System.out.println(Files.getLastModifiedTime(path));//verifica a data da ultima modificacao do arquivo
		System.out.println(Files.getOwner(path));//verifica o dono do arquivo
		System.out.println(Files.probeContentType(path));//verifica o tipo de arquivo
		
		/**EXCLUINDO ARQUIVOS*/
		
		//Files.delete(path);//deleta um arquivo e gera exceptions nos casos em que o arquivo nao exista ou por algum outro motivo nao consiga deletar o mesmo
		Files.deleteIfExists(path2);//deleta o arquivo caso o mesmo exista e se nao conseguir deletar por qualquer motivo que seja, nao gera exceptions
		
		/**CRIANDO ARQUIVOS*/
		
		Files.createFile(path2);//cria um arquivo vazio no caminho indicado
		
		/**ESCREVENDO NO ARQUIVO*/
		
		Files.write(path2, "Meu Texto".getBytes());
		
		/**COPIANDO ARQUIVOS*/
		
		Path copia = Paths.get("C:/Users/Markinho/Java/XTI/files/copia.txt");//criando um caminho para a copia do arquivo
		Files.copy(path2, copia, StandardCopyOption.REPLACE_EXISTING);//metodo que copia um arquivo, passo a origem, destino e o terceiro parametro sao opcoes disponiveis para copias de arquivo
		
		/**MOVENDO ARQUIVOS*/
		
		Path mover = Paths.get("C:/Users/Markinho/Java/XTI/files/move/fonte.txt");//criando o caminho do novo diretorio onde irei mover o arquivo
		Files.createDirectories(mover.getParent());//criando o novo diretorio usando getParent para extrair o caminho do path mover
		Files.move(path2, mover, StandardCopyOption.REPLACE_EXISTING);//movendo o arquivo eu informo onde o mesmo esta, para onde vai e acrescentei uma opcao para no momento da copia substituir caso o arquivo ja exista
		
	}

}
