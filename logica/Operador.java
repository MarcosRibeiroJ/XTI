/**
 *Trabalho com operadores (operador e operando, operadores matematicos, operadores de comparacao, operadores logicos, operadores de atribuicao, operadores especiais)
 *@author Marcos Ribeiro
 */
 
 import java.util.Scanner;
 
 public class Operador {
	
	public static void main (String[] args){
		
		/** ### Aula 13 - Operador e operando ###*/
		
		System.out.println("\nAula 13\n");
		
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
		
		System.out.println("\n\nAula 14\n");
		
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
		
		System.out.println("\n\nAula 15\n");
		
		int f = 6;
		Integer g = 7; //a partir da versao 7 do java eu posso atribuir valor a objeto dessa forma
		
		System.out.println("f eh igual a 6? " + (f == 6));//comparando se eh igual
		System.out.println("f eh diferente de 6? " + (f != 6));//comparando se eh diferente
		System.out.println("f eh maior do que 6? " + (f > 6));//comparando se eh maior
		System.out.println("f eh maior ou igual a 6? " + (f >= 6));//comparando se eh maior ou igual
		System.out.println("f eh menor do que 6? " + (f < 6));//comparando se eh menor
		System.out.println("f eh menor ou igual a 6? " + (f <= 6));//comparando se eh menor ou igual
		System.out.println("g eh um numero inteiro? " + (g instanceof Integer));//comparando se g eh um inteiro
		System.out.println("Essa frase eh uma string? " + ("Essa frase eh uma string? " instanceof String));//comparando se a pergunta eh uma string
		
		/** ### Aula 16 - Operadores Logicos###*/
		
		System.out.println("\n\nAula 16\n");
		
		int h = 6;
		
		System.out.println("h eh maior ou igual a 1 E menor ou igual a 10? " + ((h >= 1) && (h<=10)));//comparando se eh maior ou igual a 1 E menor ou igual a 10 
		System.out.println("h eh maior ou igual a 1 OU menor ou igual a 5? " + ((h >= 1) || (h<=5)));//comparando se eh maior ou igual a 1 OU menor ou igual a 5
		System.out.println("h eh maior ou igual a 1 (Negar a resposta)? " + (!(h >= 1)));//negando (invertendo um resultado)
		
		/** ### Aula 17 - Operadores de Atribuicao###*/
		
		System.out.println("\n\nAula 17\n");
		
		int i = 6;
		int j = 6;
		int k = 6;
		int l = 6;
		int m = 6;
		
		//i = i + 3; forma maior de escrever o codigo
		i += 3; //forma simplificada
		
		//j = j - 3; forma maior de escrever o codigo
		j -= 3; //forma simplificada
		
		//k = k * 3; forma maior de escrever o codigo
		k *= 3; //forma simplificada
		
		//l = l / 3; forma maior de escrever o codigo
		l /= 3; //forma simplificada
		
		//m = m % 3; forma maior de escrever o codigo
		m %= 3; //forma simplificada
		
		System.out.println("i + 3 = ? " + i);
		System.out.println("j - 3 = ? " + j);
		System.out.println("k * 3 = ? " + k);
		System.out.println("m % 3 = ? " + m);
		
		/** ### Aula 18 - Operadores de Especiais###*/
		
		System.out.println("\n\nAula 18\n");
		
		int idade = 6;
		String cidade = "Nova Odessa", pais = "Brasil";//Operador de separacao de expressoes ... ,
		String n = (idade >= 18 ? "Maior de Idade" : "Menor de Idade");//Operador ternario ... regra ? (Entao) : (Senao)
		System.out.println(n);
		
		/** ### Aula 18 - Calculo de diametro, circunferencia e area de um circulo###*/
		
		//Diametro = 2 * r
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor do Raio: ");
		double raio = s.nextDouble();
		System.out.println("\nO diametro eh: " + (2 * raio));
		
		//Circunferencia = 2 * PI * r
		
		double pi = Math.PI;
		System.out.println("\nA circunferencia eh: " + (2 * pi * raio));
		
		//Area = PI * r2
		
		System.out.println("\nA area eh: " + (pi * (raio * raio)));
	}
 }