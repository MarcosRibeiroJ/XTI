package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

/**
 * Classe criada para apresentar o conceito de serializable e transient
 * Classes serializable permitem que seus objetos sejam armazenados juntamente com todos seus atributos e metodos em arquivos que depois podem ser lidos
 * Eh diferente de gravar caracteres em um txt, nesse caso toda estrutura do objeto eh armazenada
 * A leitura dessa informacao tambem eh diferente porque o arquivo gerado tem conteudo binario que nao pode ser lido sem os metodos adequados
 * Para tornar uma classe serializable basta adicionar na declaracao da classe  implements java.io.Serializable
 * Variaveis static (variaveis da classe e nao do objeto) nao podem ser serializadas, ou seja, nao sao gravadas em arquivo
 * O modificador transient oculta uma variavel de objeto, que nao sera gravada em nenhum arquivo, mesmo se este for serializado
 * @author Marcos Ribeiro
 */

public class Serializa {

	public static void main(String[] args) throws Exception {
		
		Conta conta1 = new Conta("XTI", 111_222_333.444);//objeto que sera grava eh da classe Conta, alterei a definicao da classe acrescentnado o implements java.io.Serializable, isso permite que a classe crie objetos serializaveis
		Conta conta2 = new Conta("BIR", 111_222_333.444);//objeto que sera grava eh da classe Conta, alterei a definicao da classe acrescentnado o implements java.io.Serializable, isso permite que a classe crie objetos serializaveis
		
		/**ESCRITA DO OBJETO*/
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Markinho/Java/XTI/files/objeto.ser");//criando um objeto que contem o caminho do arquivo para armazenar objetos
		ObjectOutputStream oos = new ObjectOutputStream(fos);//criando um objeto para gravar outros objetos em arquivo
		oos.writeObject(conta1);//gravando objeto no arquivo
		oos.writeObject(conta2);//gravando objeto no arquivo
		oos.close();//feichando a conexao
		
		/**LEITURA DO OBJETO*/
		
		FileInputStream fis = new FileInputStream("C:/Users/Markinho/Java/XTI/files/objeto.ser");//criando um objeto que contem o caminho para o arquivo com objetos gravados
		ObjectInputStream ois = new ObjectInputStream(fis);//criando um novo objeto para realizar a leitura dos dados do arquivo
		Conta c1 = (Conta) ois.readObject();//o metodo readObject retorna um objeto (nesse caso um objeto do tipo Conta), sendo assim aqui estou passando esse resultado para um novo objeto do tipo Conta para poder visualizar a informacao
		Conta c2 = (Conta) ois.readObject();//o metodo readObject retorna um objeto (nesse caso um objeto do tipo Conta), sendo assim aqui estou passando esse resultado para um novo objeto do tipo Conta para poder visualizar a informacaoConta c1 = (Conta) ois.readObject();//o metodo readObject retorna um objeto (nesse caso um array de strings), sendo assim aqui estou passando esse resultado para um novo array para poder visualizar a informacao
		ois.close();//fechando a conexao
		
		c1.exibeSaldo();//aqui estou usando o metodo exibeSaldo da classe conta, mostrando que um objeto serializable quando gravado num arquivo, leva todas as informacoes do objeto, inclusive seus metodos
		c2.exibeSaldo();//aqui estou usando o metodo exibeSaldo da classe conta, mostrando que um objeto serializable quando gravado num arquivo, leva todas as informacoes do objeto, inclusive seus metodos
	}

}
