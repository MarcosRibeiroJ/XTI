package br.com.xti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Classe criada para apresentar a Collection Map
 * Essa collection consegue associar uma chave a um conjunto de valores
 * Exemplo: Um CPF que está associado as informações do usuário
 * @author Marcos Ribeiro
 */

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>(); //devo inicializar a collection passando dois tipos, um pra chave e um para o conjunto de elementos associados a essa chave
		
		pais.put("BR", "Brasil"); //adicionando uma chave e um elemento associado a ela
		pais.put("RU", "Russia");
		pais.put("IN", "Índia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR")); //verifica se uma chave existe no mapa
		System.out.println(pais.containsValue("Brasil")); //verifica se um elemento existe no mapa
		System.out.println(pais.get("CN")); //retorna o elemento associado a chave
		pais.remove("RU"); //remove uma chave e o elemento associado a ela
		
		Set<String> keys = pais.keySet(); //retorna apenas as chaves de um mapa
		
		for(String key: keys) {
			System.out.println(key + " : " + pais.get(key));
		}
	}

}
