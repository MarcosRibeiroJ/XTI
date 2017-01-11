package br.com.xti.poo;

/**
 * Classe para testar modificadores de acesso dentro do pacote da classe Funcionario 
 * Private: Visivel somente dentro da classe; Package: visivel dentro do pacote; Public: visivel para todos
 * Foi testado o uso dos metodos get e set da variavel nome da classe Funcionario
 * @author Marcos Ribeiro
 */

public class FuncionarioPacote {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		String n = f.getNome();
		f.setNome("Marcos");
		
		f.sobrenome = "Ribeiro"; //consigo acessar porque esta package na classe Funcionario

	}

}
