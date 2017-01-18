package br.com.xti.heranca;

/**
 * Classe criada para implementar os conceitos de interface
 * @author Marcos Ribeiro
 */

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado * lado;
	}
	
	

}
