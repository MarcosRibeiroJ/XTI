package br.com.xti.poo;

/**
 * Classe para testar a classe Conta
 * Fiz uma alteracao dia 28/05/17 porque a classe conta foi modificada, deixando seus atributos privados
 * Tambem criei um construtor na classe conta que ja recebe como parametros uma string para o nome do cliente e um double para o saldo
 * Essa mudanca me forcou a alterar essa classe (ContaTest), passando os atributos como parametro ja no momento da criacao do objeto
 * Ainda mantive o codigo antigo, apenas comentei para nao interferir mais.
 * @author Marcos Ribeiro
 * */

public class ContaTest {

	public static void main(String[] args) {

		Conta conta = new Conta("Marcos", 10000.00);//criacao de um objeto do tipo conta
		
		//conta.cliente = "Marcos";
		//conta.saldo = 10000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta("Ana", 8000.00);//criacao do segundo objeto do tipo conta
		
		//destino.cliente = "Ana";
		//destino.saldo = 8000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		
		conta.exibeSaldo();
		destino.exibeSaldo();

	}

}
