package br.com.xti.heranca;

/**
 * Classe criada para testar o suo de interfaces
 * @author Marcos Ribeiro
 *
 */

public class InterfaceTest {

	public static void area(AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel o) {
		System.out.println(o.calculaVolume());
	}
	
	public static void main(String[] args) {
		
		area(new Quadrado(2));
		volume(new Cubo(2));

	}

}
