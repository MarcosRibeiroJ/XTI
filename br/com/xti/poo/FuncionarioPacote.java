package br.com.xti.poo;

/**
 * Classe para testar modificadores de acesso dentro do pacote da classe Funcionario 
 * Private: Visivel somente dentro da classe; Package: visivel dentro do pacote; Public: visivel para todos
 * @author Marcos Ribeiro
 */

public class FuncionarioPacote {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		//f.nome = "Marcos"; nao consigo acessar porque esta private na classe Funcionario
		
		f.sobrenome = "Ribeiro"; //consigo acessar porque esta package na classe Funcionario

	}

}
