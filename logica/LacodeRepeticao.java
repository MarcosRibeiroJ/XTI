/**
 * Estruturas de repeticao: For
 *@author Marcos Ribeiro
 */

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
		
	}//fim do metodo main
}//fim da classe