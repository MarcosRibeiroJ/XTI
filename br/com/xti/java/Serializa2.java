package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

/**
 * Classe criada para adaptar a resolucao do desafio da aula 64 que consistia em criar um programa que:
 * Tenha um metodo para receber uma quantidade de contas e grava-las em um txt
 * Tenha um metodo que consiga ler os dados de um arquivo txt e armazena-los novamente em um novo objeto
 * Nessa adaptacao, os dados nao sao mais armazenados em um txt, mas em um arquivo serializado.
 * Ou seja, um arquivo que armazena diretamente os objetos criados e pode recupera-los com todos seus atributos e metodos
 * @author Marcos Ribeiro
 */

public class Serializa2 {
	
	//Metodo que grava o ArrayList de contas em um arquivo serializado
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		
		try(FileOutputStream fos = new FileOutputStream("C:/Users/Markinho/Java/XTI/files/contas.ser")) {//criando um objeto que contem o caminho do arquivo para armazenar objetos
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)) {//criando um objeto para gravar outros objetos em arquivo
				oos.writeObject(contas);//gravando o ArrayList de contas no arquivo serializado 
			}
		}
	}
		
	//Metodo que le o arquivo serializado e retorna os objetos armazenados nele (nesse caso, um ArrayList de contas)
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		
		try(FileInputStream fis = new FileInputStream("C:/Users/Markinho/Java/XTI/files/contas.ser")) {//criando um objeto que contem o caminho para o arquivo com objetos gravados
			try(ObjectInputStream ois = new ObjectInputStream(fis)) {//criando um novo objeto para realizar a leitura dos dados do arquivo
				return (ArrayList<Conta>) ois.readObject();//determinando que o return do metodo sera o objeto armazenado no arquivo serializado (aqui estou fazendo um cast do objeto)
			}
		}
	}
		
	public static void main(String[] args) throws Exception {
		
		/**Criacao do array de contas*/
		 
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));
		
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);//gravando o array de contas no arquivo serializado
		ArrayList<Conta> contas2 = operacao.recuperarContas();//recuperando o objeto armazenado no arquivo serializado
		for (Conta conta : contas2) {
			conta.exibeSaldo();//crio um laco que usa o proprio metodo da classe conta para exibir os dados de cada objeto do array
		}
	}

}
