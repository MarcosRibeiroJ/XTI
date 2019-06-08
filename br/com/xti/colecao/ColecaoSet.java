package br.com.xti.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Classe criada para apresentar os recursos da Collection Set
 * Esse tipo de collection não aceita elementos duplicados
 * @author Marcos Ribeiro
 */

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"Verde", "Amarelo", "Azul", "Branco", "Azul", "Amarelo", "Verde"};
		
		List<String> list = Arrays.asList(cores);
		
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list); //criando a coleção set e passando a lista de cores como parametro
		System.out.println(set);

	}
}
