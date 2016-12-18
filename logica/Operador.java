/**
 *Trabalho com operadores (operador e operando, operadores matematicos, operadores de comparacao, operadores logicos, operadores de atribuicao, operadores especiais)
 *@author Marcos Ribeiro
 */
 
 public class Operador {
	
	public static void main (String[] args){
		
		/** ### Aula 13 - Operador e operando ###*/
		
		System.out.println("Aula 13\n");
		
		//-2 operador unario (o sinal de negativo altera o valor do 2,ou seja, somente um operando
		//2 + 3 operador binario (dois operandos)
		// true ? "sim" : "nao" operador ternario (tres operandos)
		
		int x = 9 + 4; //somar
		String y = "9" + "4"; //concatenar
		double z = 7 - 4 + 3 * 2;//matematica sem definir ordem
		double a = (7 - 4 + 3) * 2;//matematica definindo ordem
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("a = " + a);
		
		/** ### Aula 14 - Operadores Matematicos###*/
		
		System.out.println("\nAula 14\n");
		
		double b = 7 % 3;//modulo (resto) da divisao de 7 por 3
		int c = -(-3);//mudando o sinal do numero
		int d = 6;
		int e = ++d;//incrementando 1 ao d
		
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("d = " + d);
		
		/** ### Aula 15 - Operadores de Comparacao###*/
		
		System.out.println("\nAula 14\n");
		
		int f = 6;
		Integer g = 7; //a partir da versao 7 do java eu posso atribuir valor a objeto dessa forma
		
		System.out.println("f eh igual a 6? " + (f == 6));//comparando se eh igual
		System.out.println("\nf eh diferente de 6? " + (f != 6));//comparando se eh diferente
		System.out.println("\nf eh maior do que 6? " + (f > 6));//comparando se eh maior
		System.out.println("\nf eh maior ou igual a 6? " + (f >= 6));//comparando se eh maior ou igual
		System.out.println("\nf eh menor do que 6? " + (f < 6));//comparando se eh menor
		System.out.println("\nf eh menor ou igual a 6? " + (f <= 6));//comparando se eh menor ou igual
		System.out.println("\ng eh um numero inteiro? " + (g instanceof Integer));//comparando se g eh um inteiro
		System.out.println("\nEssa frase eh uma string? " + ("\nEssa frase eh uma string? " instanceof String));//comparando se a pergunta eh uma string
		
	}
 }