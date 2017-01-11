package br.com.xti.logica;

import br.com.xti.poo.Funcionario;

/**
 * Classe para testar modificadores de acesso fora do pacote da classe Funcionario 
 * Private: Visivel somente dentro da classe; Package: visivel dentro do pacote; Public: visivel para todos
 * @author Marcos Ribeiro
 */

public class FuncionarioExterno {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		// f.nome = "Marcos"; nao consigo acessar porque esta private na classe Funcionario
		// f.sobrenome = "Ribeiro"; nao consigo acessar porque esta package na classe Funcionario
		f.cidade = "Nova Odessa"; //consigo acessar porque esta public na classe Funcionario
	
	}

}
