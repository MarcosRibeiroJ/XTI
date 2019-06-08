package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Classe criada para apresentar os utilitarios da collection
 * @author Marcos Ribeiro
 */

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guaraná");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açaí");
		list.add("Banana");
		
		System.out.println(list);
		
		Collections.sort(list); //ordena em ordem alfabetica
		
		System.out.println(list);
		
		Collections.reverse(list); //inverte a ordem dos elementos
		
		System.out.println(list);
		
		Collections.shuffle(list); //reorganiza os elementos em uma ordem aleatória
		
		System.out.println(list);
		
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja"); //adiciona mais elementos a coleção
		
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja"));
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		boolean d = Collections.disjoint(list, list2); //verifica se uma segunda lista está contida na primeira lista
		
		Collections.sort(list);
		
		int indice = Collections.binarySearch(list, "Guaraná"); //retorna a posição de um elemento na lista
		
		System.out.println(indice);
		
		Collections.fill(list, "Frutas");
		
		System.out.println(list);
		
		Collection<String> constante = Collections.unmodifiableList(list); //cria uma lista que não pode ser modificada

	}

}
