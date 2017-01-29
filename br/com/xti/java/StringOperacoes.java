package br.com.xti.java;

/**
 * Classe que apresenta as principais operações realizadas com strings, sendo:
 * Criação de Strings
 * Operações Básicas (tamanho total, retornar um caracter, retornar a string toda)
 * Localização
 * Comparação
 * Extração de Dados
 * @author Marcos Ribeiro
 */

public class StringOperacoes {

	public static void main(String[] args) {
		
		/**CRIANDO STRINGS*/
		
		String s1 = "Write Onde";
		String s2 = s1 + " Run AnyWhre";
		String s3 = new String("Java Virtual Machine Java");
		char[] array = {'J','a','v','a'};
		String s4 = new String(array);
		
		/**OPERACOES BASICAS*/
		
		int tamanho = s1.length();//tamanho total da string
		char caracter = s1.charAt(0);//retorna o caracter a partir da posicao dentro da string (array), inicando em 0 ate length
		String texto = s1.toString();//retorna a string inteira
		
		/**LOCALIZACAO*/
		
		//indexOf retorna a posicao da primeira vez que um caracter ou texto aparece na string
		//diferenciando maiuscula de minuscula
		//caso nao encontre o caracter pesquisado, retorna -1
		int posicaoInicialCaracter = s3.indexOf('a');
		System.out.println("A posicao inicial eh " + posicaoInicialCaracter);
		int posicaoInicialTexto = s3.indexOf("Virtual");
		System.out.println("A posicao inicial eh " + posicaoInicialTexto);
		
		//lastIndexOf retorna a posicao da ultima vez que um caracter ou texto aparece na string
		//diferenciando maiuscula de minuscula
		//caso nao encontre o caracter pesquisado, retorna -1
		int posicaoFinalCaracter = s3.lastIndexOf('a');
		System.out.println("A posicao final eh " + posicaoFinalCaracter);
		int posicaoFinalTexto = s3.lastIndexOf("Java");
		System.out.println("A posicao final eh " + posicaoFinalTexto);
		
		//isEmpty returna true caso a string esteja vazia ou false caso nao esteja vazia
		boolean vazia = s3.isEmpty();
		System.out.println("A string s3 esta vazia: " + vazia);
		
		/**COMPARACAO*/
		
		 
		String xti = "XTI";
		String xti2 = "XTI Curso Java";
		
		
		
		//equals eh um metodo de comparacao de conteudos (valores) de variaveis string
		//ele diferencia maiusculas de minusculas
		boolean igual = xti.equals("xti");
		System.out.println("XTI eh igual a xti: " + igual);
		
		//equalsIgnoreCase eh um metodo de comparacao de conteudos (valores) de variaveis string
		//ele nao diferencia maiusculas de minusculas
		boolean igual2 = xti.equalsIgnoreCase("xti");
		System.out.println("XTI eh igual a xti: " + igual2);
		boolean igual3 = xti.equalsIgnoreCase("Xti");
		System.out.println("XTI eh igual a Xti: " + igual3);
		
		//startsWith eh um metodo que verifica se uma string comeca com um determinado trecho de string
		//diferencia maiuscula de minuscula
		boolean comecaCom = xti2.startsWith("xti");
		System.out.println("A variavel xti2 comeca com xti: " + comecaCom);
		boolean comecaCom2 = xti2.startsWith("XTI");
		System.out.println("A variavel xti2 comeca com xti: " + comecaCom2);
		
		//endsWith eh um metodo que verifica se uma string comeca com um determinado trecho de string
		//diferencia maiuscula de minuscula
		boolean terminaCom = xti2.endsWith("java");
		System.out.println("A variavel xti2 termina com java: " + terminaCom);
		boolean terminaCom2 = xti2.endsWith("Java");
		System.out.println("A variavel xti2 termina com Java: " + terminaCom2);
		
		//compareTo eh um metodo que compara strings tanto de texto quanto numericas
		//retorna um inteiro representando quanto uma eh maior que outra
		//Se retorna um valor menor que zero quer dizer que a string eh menor que outra
		//Se retorna um valor maior que zero quer dizer que a string eh maior que outra
		//Se retornar zero quer dizer que as duas strings sao iguais
		//Pode ser utilizado para ordenar valores em ordem alfabetica ou alfanumerica
		int ordena = "amor".compareTo("amar");
		System.out.println(ordena);
		
		//regionMatches pesquisa um texto no meio de uma string
		//regionMatches(diferenciando maiusc de minusc, a partir de qual caracter começa a pesquisa, "qual texto", iniciando na posicao de numero ..., com quantos caracteres)
		//returna true caso encontre o texto ou false caso nao encontre
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(6, "Olhe", 0, 4);//diferenciando maiusculas de minusculas
		System.out.println(o);
		boolean o2 = so.regionMatches(true, 6, "Olhe", 0, 4);//nao diferenciando maiusculas de minusculas
		System.out.println(o2);
		
		/**EXTRACAO DE DADOS*/
		
		//substring eh um metodo que retorna um treco de uma string
		//podemos definir um trecho somente indicando o inicio, ou indicando o inicio e fim
		String frase = "O Brasil é lindo";
		String trecho = frase.substring(9);//somente inicio
		System.out.println(trecho);
		String trecho2 = frase.substring(9,11);//inicio e fim
		System.out.println(trecho2);
		
		//concat eh um metodo que concatena strings
		String frase2 = frase.concat(" e maravilhoso!");
		System.out.println(frase2);
		
		//replace eh um metodo que substitui um caracter por outro
		//primeiro o antigo e em seguida o novo
		String frase3 = frase.replace('s', 'z');
		System.out.println(frase3);
		
		//replaceFirst eh um metodo que substitui a primeira string por outra
		//primeiro o antigo e em seguida o novo
		String frase4 = frase.replaceFirst(" ", "X");
		System.out.println(frase4);
		
		//replaceAll eh um metodo que substitui todas as strings por outra
		//primeiro o antigo e em seguida o novo
		String frase5 = frase.replaceAll(" ", "X");
		System.out.println(frase5);
		
		//toUpperCase eh um metodo que transforma todas as letras da string em maiusculas
		String frase6 = frase2.toUpperCase();
		System.out.println(frase6);
		
		//toLowerCase eh um metodo que transforma todas as letras da string em minusculas
		String frase7 = frase6.toLowerCase();
		System.out.println(frase7);
		
		//trim eh um metodo que retira espaços em branco de strings
		//somente de inicio e fim de strings
		String frase8 = ("   espaço    ".trim());
		System.out.println(frase8);
	}

}
