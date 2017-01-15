package br.com.xti.heranca;

/**
 * Classe Animal criada para testar a heranca
 * Nesse exemplo criaremos um objeto cachorro e um objeto galinha, ambos herdando atributos e metodos da classe animal 
 * @author Marcos Ribeiro
 */

public class AnimalTest {
	
	//Metodo que recebe um objeto do tipo Animal e usando polimorfismo, 
	//adapta qual metodo deve ser usado(o recebido na heranca da superclasse ou o interno da classe de cada animal)
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		//Exemplos de instanceof (compara se um objeto pertence a uma classe)
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		//Metodos da classe Object (classe que todas as demais classes pertencem e que nao eh necessario usar extends)
		
		System.out.println(toto.equals(carijo));//compara dois objetos
		System.out.println(toto.hashCode());//cria um hash code para um objeto
		System.out.println(toto.getClass());//retorna a classe que o objeto pertence
		System.out.println(toto.toString());//cria uma representacao da classe em string
		
		//Chamando o metodo barulho e passando como parametros os objetos cachorro e galinha
		barulho(toto);
		barulho(carijo);
		

	}//fim main

}//fim classe
