package br.com.xti.heranca;

/**
 * Classe criada para exemplificar e testar o uso de polimorfismo
 * Essa classe cria um metodo calcule que recebe como parametro um objeto do tipo OperacaoMatematica e dois valores double
 * O metodo calcule por sua vez, chama o metodo calcular da superclasse OperacaoMatematica passando como parametro os valores double recebidos pelo metodo calcule
 * Para finalizar, testamos o metodo calcule com objetos do tipo Soma e Multiplicacao
 * Em cada caso, o metodo ira se modificar conforme a classe desejada
 * @author Marcos Ribeiro
 */

public class OperacaoTest {

	public static void calcule(OperacaoMatematica operacao, double x, double y) {
		System.out.println(operacao.calcular(x, y));
	}
	
	public static void main(String[] args) {
		
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);

	}

}
