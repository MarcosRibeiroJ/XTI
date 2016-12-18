/**
 *Apresentar os conceitos de variavel
 * @author Marcos Ribeiro

 */

public class Variavel {
	
	public static void main (String[] args){
		
		String nome = "Marcos Ribeiro"; //variavel de referencia, ela faz referencia a um objeto do tipo string
		int idade = 26; //variavel primitiva, na memoria do computador esta armazenado exatamente o valor de 26 em binarios
		boolean solteiro = false; // variavel primitiva, esta armazenado 0 na memoria
		
		
		//Contantes em java devem iniciar com o modificador final, o nome deve ser todo em maiuscula e caso seja nome composto, deve ser separado por underline.
		//Caso eu tente atribuir outro valor a uma constante o programa nao ira compilar.
		
		//Abaixo, temos 3 exemplos de constantes:
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		final double PI = 3.14;
		
		
		System.out.println(nome);
		System.out.println(PI);
	}
}