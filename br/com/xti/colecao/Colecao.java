package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Classe criada para apresentar os conceitos de Collection
 * @author Marcos Ribeiro
 */

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A"); //adiciona elemento
		c.add("E");
		c.add("I");
		System.out.println(c.toString()); //converte para string
		System.out.println(c.isEmpty()); //verifica se a cole��o est� vazia
		System.out.println(c.contains("A")); //procura um elemento dentro da cole��o
		
		c.remove("A");
		System.out.println(c.toString()); //converte para string
		
		/*grupos*/
		
		Collection<String> c2 = Arrays.asList("O","U"); //criando uma segunda cole��o
		c.addAll(c2); //adicionando a segunda cole��o na primeira
		System.out.println(c.toString()); //converte para string
		
		System.out.println(c.containsAll(c2)); //verificando se todos elementos da 2� cole��o est�o na 1�
		c.removeAll(c2); //remove todos elementos da segunda cole��o que est�o na primeira cole��o
		System.out.println(c.toString()); //converte para string
		
		/*percorrer*/
		
		for(String string: c) {
			System.out.println(string);
		}
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		c.clear();
		System.out.println(c.toString()); //converte para string

	}

}
