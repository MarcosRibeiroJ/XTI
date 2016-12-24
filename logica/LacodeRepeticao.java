/**
 * Estruturas de repeticao: For
 *@author Marcos Ribeiro
 */

import java.util.ArrayList;

 public class LacodeRepeticao {
 
	public static void main (String[] args) {
	
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
		
		
	}//fim do metodo main
}//fim da classe