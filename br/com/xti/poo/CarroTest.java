package br.com.xti.poo;

/**
 * Classe para exemplificar a criacao de construtores de classe
 * @author Marcos Ribeiro
 */

public class CarroTest {

	public static void main(String[] args) {
		
		//Criando um objeto do tipo Carro com o construtor padrao sem argumentos
		//Nesse caso devo inicializar cada atributo do objeto para que este receba um valor
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		//Criando um objeto do tipo Carro com o construtor que ja recebe como parametro os valores dos atributos do objeto
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		
		System.out.println(koenigsegg.modelo);

	
	}//fim do main
}//fim da classe
