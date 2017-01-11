package br.com.xti.poo;

/**
 * Classe para testar modificadores de acesso dentro da classe Funcionario
 * Private: Visivel somente dentro da classe; Package: visivel dentro do pacote; Public: visivel para todos
 * Foram criados metodos get e set para as variaveis nome e ativo
 *@author Marcos Ribeiro 
 */

public class Funcionario {
	
	private String nome;
	String sobrenome;
	public String cidade;
	private boolean ativo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
