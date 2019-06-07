package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe criada para apresentar os conceitos da Collection List
 * @author Marcos Ribeiro
 */

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tênis");
		list.add("Volei");
		list.add("Natação");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			String esporte = list.get(i);
			list.set(i, esporte.toUpperCase());
		}
		
		System.out.println(list);
		System.out.println(list.indexOf("BOXE")); //pesquisar um elemento na lista
		System.out.println(list.subList(2, 4)); //criar uma sublista
		list.subList(2, 4).clear(); //removendo itens da sublista

	}

}
