package br.com.xti.poo;

/**
 * Classe com operacoes basicas de uma conta bancaria
 * Fiz uma alteracao nessa classe dia 28/05/17 deixando seus atributos privados
 * Tambem criei um construtor padrao que nao recebe nenhum parametro e um que ja recebe como parametros uma string para o nome do cliente e um double para o saldo
 * Como o desafio da aula 64 iria utilizar os dados de uma conta criada, tambem criei um get para o nome e saldo do cliente
 * Fiz uma alteracao nessa classe dia 31/05/2017 para torna-la serializable (seus objetos podem ser armazenados em arquivo)
 * E o atributo saldo esta com modificador transient para demonstrar como ocultar um atributo e nao serializa-lo junto com o restante das informacoes do objeto
 * @author Marcos Ribeiro
 * */

public class Conta implements java.io.Serializable {
	
	private String cliente;
	transient private double saldo;
	
	//Construtor padrao vazio
	public Conta() {
		
	}
	
	//construtor com parametro
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void exibeSaldo(){
		System.out.println(cliente + " seu saldo eh R$ " + saldo);
	}
	
	public void saca(double valor){
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}

}
