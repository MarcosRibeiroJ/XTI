/**
 *Basico de Arrays : Classe, inicializacao, ordenar, pesquisar e acessar metodo
 *@author Marcos Ribeiro
 */
 
import java.util.Arrays;

 public class ArraySimples {
 
	public static void main (String[] args) {
	
		
		//forma de inicializar array digitando numero maximo de casas
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		
		//forma de inicializar array inserindo diretamente os valores
		String[] paises = {"Brasil", "Russia", "India", "China"};
		System.out.println(paises[0]);
		
		//verificando tamanho do array
		System.out.println(paises.length);
		
		//tranformando os dados do array em uma unica string
		System.out.println(Arrays.toString(paises));
		
		//pesquisando dentro de um array
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//Ordenando um array (devo informar o array, a posicao inicial e a posicao final para ordenar)
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		//Acessando um metodo dentro de um array
		Double[] valores = {12.35, 345.345};
		System.out.println(valores[0].intValue());
	}
 
 }