package br.com.xti.poo;

/**
 * Classe para exemplificar a criacao de construtores de classe e a compisicao utilizando objetos de outras classes
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
		
		//Criando um objeto do tipo Motor que sera utilizado para compor o objeto ferrari
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		
		//adicionando o objeto motor no objeto ferrari
		ferrari.motor = v12;
		
		//Criando um objeto do tipo Carro com o construtor que ja recebe como parametro os valores dos atributos do objeto
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		
		//Criando um objeto do tipo Motor que sera utilizado para compor o objeto koenigsegg, nesse caso usamos o construtor que ja recebe os parametros do objeto motor 
		Motor v8 = new Motor("V8", 1018);
		
		//adicionando o objeto motor no objeto koenigsegg
		koenigsegg.motor = v8;
		
		//Criando um objeto do tipo Carro com o construtor que ja recebe como parametro
		//os valores dos atributos do objeto e ja instancia um objeto do tipo Motor
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(koenigsegg.modelo);
		System.out.println(koenigsegg.motor.tipo);
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.tipo);

	
	}//fim do main
}//fim da classe
