package br.com.xti.java;

/**
 * Classe criada para apresentar o StringBuffer e StringBuilder, ambos utilizados quando quero criar textos que podem ser modificados
 * A classe String convencional cria um novo objeto cada vez que tento modificar o conteudo de uma string
 * A diferença entre o StringBuffer e o StringBuilder é que os metodos da StringBuffer podem ser executados simultaneamente, enquanto que os da StringBuilder nao.
 * Essa diferença só é percebida em um ambiente onde muitas requisições são feitas ao mesmo tempo a um mesmo objeto
 * @author Marcos Ribeiro
 */

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		StringBuilder s2 = new StringBuilder("Java");
		
		System.out.println(s0.length());//tamanho da string
		System.out.println(s0.capacity());//capacidade total de armazenamento de strings
		System.out.println(s1.length());//tamanho da string
		System.out.println(s1.capacity());//capacidade total de armazenamento de strings
		
		/**Incluindo Conteudos*/
		
		System.out.println(s1);
		s1.append(" Trabalhando ");//adiciona novos dados para a string
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");//numa mesma linha adiciona um array de caracteres e outro texto
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.reverse());//imprime os caracteres invertidos
		
		String s = "Oi" + " como " + "vai você?";
		//É o mesmo que:
		String sb = new StringBuilder("Oi").append(" como ").append("vai você?").toString();
		
		System.out.println(s);
		System.out.println(sb);
		
		/**Excluindo Conteudos*/
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();//utilizo o metodo delete(posicao inicial, posicao final) dos dados que quero remover da string
		System.out.println(url);
	}

}
