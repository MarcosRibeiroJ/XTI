package br.com.xti.poo;

/**
 * Classe para testar modificadores de acesso dentro da classe Funcionario
 * Private: Visivel somente dentro da classe; Package: visivel dentro do pacote; Public: visivel para todos
 *@author Marcos Ribeiro 
 */

public class Funcionario {
	
	private String nome;
	String sobrenome;
	public String cidade;
	
	public String getNome() {
		return nome;
	}
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome ="Marcos";
		
	}

}
