/**
 *Basico de Arrays : Classe, inicializacao, ordenar, pesquisar e acessar metodo, matriz
 *@author Marcos Ribeiro
 */
 
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

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
		
		/**Aula 21 - Dimensoes de um array*/
		
		//Uma dimensao
		String[] uma = {"Ricardo", "Sandra"};
		
		
		//Duas dimensoes
		String[][] duas = {{"Ricardo", "M", "DF"}, {"Sandra", "F", "MG"}};
		System.out.println(duas[1][0]);
		
		//Programa para selecionar carta de baralho
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouro"};
		
		
		Random r = new Random(); //criando um objeto da classe de aleatorios
		
		int indiceFace = r.nextInt(faces.length);//criando uma variavel de inteiro para o indice do array, usando como tamanho maximo o tamanho do array de faces
		String face = faces[indiceFace];//atribuindo a uma string o valor da face de acordo com o indice aleatorio
		
		int indiceNipe = r.nextInt(nipes.length);//criando uma variavel de inteiro para o indice do array, usando como tamanho maximo o tamanho do array de nipes
		String nipe = nipes[indiceNipe];//atribuindo a uma string o valor do nipe de acordo com o indice aleatorio
				
		String carta = face + " " + nipe;//atribuindo a uma string o valor da face aleatoria e do nipe aleatorio
		
		System.out.println(carta);
		
		/**Aula 22 - ArrayList*/
		
		ArrayList<String> cores = new ArrayList<String>();//criando um objeto do tipo ArrayList
		cores.add("Branco");//adicionando cor
		cores.add(0, "Vermelho");//adicionando cor na primeira posicao do array
		cores.add("Amarelo");//adicionando cor
		cores.add("Azul");//adicionando cor
		System.out.println("ArrayList de cores: " + cores.toString());//transformando o array em uma unica string
		System.out.println("Tamanho do ArrayList de cores: " + cores.size());//tamanho do array
		System.out.println("Cor da Terceira posicao: " + cores.get(2));//imprimir um elemento especifico de acordo com o indice
		System.out.println("Numero do indice da cor Branca: " + cores.indexOf("Branco"));//pesquisar a posicao de um elemento do array
		System.out.println("Contem a cor amarela no array: " + cores.contains("Amarelo"));//pesquisar se um elemento existe no array
		cores.remove("Azul");//removendo a cor azul do array
		System.out.println("ArrayList de cores: " + cores.toString());//transformando o array em uma unica string
		
	}
 
 }