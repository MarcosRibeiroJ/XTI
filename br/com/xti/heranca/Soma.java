package br.com.xti.heranca;

/**
 * Classe criada para exemplificar o uso de polimorfismo
 * Essa classe herda um metodo calcular da superclasse OperacaoMatematica
 * O metodo calcular eh modificado para retornar uma operacao de soma com os valores double recebidos
 * @author Marcos Ribeiro
 */

public class Soma extends OperacaoMatematica {
	
	public double calcular(double x, double y) {
		return x + y;
	}

}
