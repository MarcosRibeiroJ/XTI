package br.com.xti.logica;
/**
 *Apresentar os conceitos de variavel
 * @author Marcos Ribeiro

 */

public class Variavel {
	
	public static void main (String[] args){
		
		/**Variaveis primitivas e de referencia*/
		
		String nome = "Marcos Ribeiro"; //variavel de referencia, ela faz referencia a um objeto do tipo string
		int idade = 26; //variavel primitiva, na memoria do computador esta armazenado exatamente o valor de 26 em binarios
		boolean solteiro = false; // variavel primitiva, esta armazenado 0 na memoria
		
		
		/**Contantes em java devem iniciar com o modificador final, o nome deve ser todo em maiuscula e caso seja nome composto, deve ser separado por underline.
		Caso eu tente atribuir outro valor a uma constante o programa nao ira compilar.*/
		
		//Abaixo, temos 3 exemplos de constantes:
		
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		final double PI = 3.14;
		
		
		Integer idade2 = new Integer("26");//criando um objeto da classe Integer e atribuindo o inteiro 26
		Double preco = new Double ("12.45");//criando um objeto da classe Double e atribuindo a string "12.45"
		double d = preco.doubleValue();//recuperando o valor double do objeto preco
		int i = preco.intValue();//recuperando o valor inteiro do objeto preco
		byte b = preco.byteValue();//recuperando o valor em bytes do objeto preco
		Boolean solteiro2 = new Boolean("false");//criando um objeto da classe Boolean e atribuindo a string "false"
		
		/**Conversao Estatica
		
		Converter uma string recebida em algum valor, sem necessidade de criar um objeto*/
		
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		/**Converter uma sequencia binaria em alguma base (2, 8, 10, 16)*/
		
		int i2 = Integer.valueOf("010010110", 2);
		
		
		System.out.println("Variavel primitiva");
		System.out.println(idade);
		System.out.println("\nValor recuperado da variavel preco");
		System.out.println(i);
		System.out.println("\nConversao estatica de string para float");
		System.out.println(f1);
		System.out.println("\nConversao de uma sequencia binaria para inteiro");
		System.out.println("\n010010110");
		System.out.println(i2);
		
	}
}