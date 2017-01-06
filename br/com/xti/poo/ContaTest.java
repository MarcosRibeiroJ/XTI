package br.com.xti.poo;

/**
 * Classe para testar a classe Conta
 * @author Marcos Ribeiro
 * */

public class ContaTest {

	public static void main(String[] args) {

		Conta conta = new Conta();//criacao de um objeto do tipo conta
		
		conta.cliente = "Marcos";
		conta.saldo = 10000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();//criacao do segundo objeto do tipo conta
		
		destino.cliente = "Ana";
		destino.saldo = 8000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		
		conta.exibeSaldo();
		destino.exibeSaldo();

	}

}
