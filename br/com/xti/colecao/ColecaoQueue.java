package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Classe criada para apresentar a Collection Queue
 * Essa collection organiza os elementos em fila, sendo que cada novo elemento adicionado
 * vai para o final da fila, obedecendo a regra First in First Out (FIFO)
 * Primeiro a chegar é o Primeiro a sair
 * @author Marcos Ribeiro
 */

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ricardo"); //adicionando elemento na fila
		fila.add("Sandra");
		fila.offer("Beatriz"); //outro metodo para adicionar elemento na fila
		
		System.out.println(fila);
		
		System.out.println(fila.peek()); //exibe qual é o primeiro elemento da fila
		System.out.println(fila.poll()); //remove o primeiro elemento da fila
		System.out.println(fila);
		
		/*Outros métodos da classe LinkedList*/
		
		LinkedList<String> f = (LinkedList<String>) fila;
		
		f.addFirst("Caio"); //adiciona no inicio da fila
		f.addLast("Juliana"); //adiciona no final da fila
		
		System.out.println(f);
		
		System.out.println(f.peekFirst()); //retorna o primeiro elemento da fila
		System.out.println(f.peekLast()); //retorna o ultimo elemento da fila
		
		f.pollFirst(); //remove o primeiro elemento da fila
		f.pollLast(); //remove o ultimo elemento da fila
		
		System.out.println(f);
		
		

	}

}
