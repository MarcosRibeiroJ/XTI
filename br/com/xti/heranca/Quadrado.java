package br.com.xti.heranca;

/**
 * Classe criada para implementar os conceitos de interface
 * @author Marcos Ribeiro
 */

public class Quadrado implements AreaCalculavel {

	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
