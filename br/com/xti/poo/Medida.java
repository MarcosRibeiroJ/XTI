package br.com.xti.poo;

/**
 * Enum com lista representando medidas de distancia
 * @author Marcos Ribeiro
 */

public enum Medida {
	
	//Crio as constantes e elas ja chamam o metodo construtor logo abaixo, passando como
	//parametro para o titulo uma string
	MM("Milimetro"), CM("Centimetro"), M("Metro");
	
	//criando a string titulo que ira receber o valor do titulo de cada constante
	public String titulo;
	
	//Criando o construtor da lista que recebe como parametro a string informada
	Medida(String titulo) {
		this.titulo = titulo;
	}

}
