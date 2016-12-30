/**
 * Estruturas de repeticao: For, Foreach, While e Do While
 *@author Marcos Ribeiro
 */

import java.util.ArrayList;
import java.util.Scanner;

 public class LacodeRepeticao {
 
	public static void main (String[] args) {
	
		/**Aula 26 - For*/
		
		System.out.println("\n\n Aula 26\n");
		
		//Exemplo 1		
		for(int i=0; i < 3; i++){
			System.out.println(i);
		}
		
		//Exemplo 2
		String texto = "";
		for(int i=0; i < 3; i++){
			texto += i + " , ";
		}
		System.out.println(texto);
		
		//Exemplo 3
		String texto2 = "";
		for(int i=10; i >= 0; i--){
			texto2 += i + " , ";
		}
		System.out.println(texto2);
		
		//Exemplo 4
		String texto3 = "";
		for(int i=0; i <= 20; i++){
			if(i % 2 == 0){
				texto3 += i + " , ";
			}
		}
		System.out.println(texto3);
		
		int max = 3;
		for(int i = 0; i <= max; i++){
			for (int j = 0; j <= max; j++){
				if((i == 0) || (j == 0) || (i == max) || (j == max)){
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.print("\n");
		}
		
		
		/**Aula 27 - Foreach*/
		
		System.out.println("\n\n Aula 27\n");
		
		//Exemplo 1: percorrer e imprimir elementos de um array
		int[] pares = {2, 4, 6, 8};
		for(int i = 0; i < pares.length; i++){
			int par = pares[i];
			System.out.println(par);
		}
		
		//Exemplo 2: percorrer e imprimir elementos de um array, utilizando foreach
		for(int par : pares){ //para cada elemento do array fazer ...
			System.out.println(par);
		}
		
		//Exemplo 3: Preencher um array list com numeros e imprimir
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++){
			list.add(i);
		}
		for(Integer numero : list){
			System.out.println(numero);
		}
		
		/**Aula 28 - While e Do While*/
		
		System.out.println("\n\n Aula 28\n");
		
		
		//Exemplo 1
		int i = 3;
		while (i < 2){
			System.out.println(i);
			i++;
		}
		
		//Exemplo 2 com do while
		
		do {
			System.out.println(i);
			i++;
		} while (i < 2);
		
		//Exemplo 3: Receber uma lista de produtos digitados pelo usuario e qndo o usuario digitar fim o programa imprime a lista na tela
		
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		String produto;
		
		System.out.println("Bem Vindo ao sistema de cadastro\n");
		System.out.println("Favor digitar um produto ou fim para finalizar: ");
		
		while(!"fim".equals(produto = s.nextLine())){ //enquanto produto digitado nao for igual a palavra fim ...
			produtos.add(produto);
		}
		System.out.println("Lista de Pordutos Cadastrados: " + produtos.toString());
		
		/**Aula 30 - Break, Continue e Rotulos*/
		
		System.out.println("\n\nAula 30\n");
		
		//Exemplo 1: Parando um loop infinito
		
		while(true) {
			System.out.println("Entrou");
			break;//parando o loop
		}
		
		//Exemplo 2: Diferenca de break e continue
		
		for(int m = 0; m < 10; m++){
			if(m == 5){
				break;
			}
			System.out.println(m);
		}
		System.out.println("\n\n");
		for(int m = 0; m < 10; m++){
			if(m == 5){
				continue;
			}
			System.out.println(m);
		}
		
		//Exemplo 3: Usando rotulos na repeticao (rotulo eh um nome dado a um determinado loop, serve para poder interagir com um laco mais externo)
		
		System.out.println("\n\n");
		boolean[][] matriz =
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
		
		linha: // adicionei um rotulo para o laco que percorre as linhas da matriz
		for (int a = 0; a < matriz.length; a++){
			System.out.print("A ");
			coluna: //adicionei um rotulo para o laco que percorre as colunas de uma matriz
			for (int b = 0; b < matriz[a].length; b++){
				if(matriz[a][b]){
					System.out.print("TRUE ");
					break linha; //aqui estou pedindo para ele parar a busca completa da matriz, considerando que ele nao ira mais para a linha de baixo assim que achar o elemento procurado
				}
				System.out.print("B ");
			}
		}
		
	}//fim do metodo main
}//fim da classe