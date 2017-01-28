package br.com.xti.erros;

//import br.com.xti.heranca.Animal;
//import br.com.xti.heranca.Cachorro;
//import br.com.xti.heranca.Galinha;

/**
 * Classe criada para listar as principais excecoes (erros) que um metodo pode apresentar
 * @author Marcos Ribeiro
 */

public class ExcecoesComuns {
	
	

	public static void main(String[] args) {
		
		//* NullPointerException: Tentar acessar um objeto nulo
		
		//int [] arrayNull;
		//System.out.println(arrayNull.length);
		
		
		
		//* ArithmeticException: Tentar realizar uma operacao matematica impossivel
		
		//int i = 5 / 0;
		
		
		
		//* ArrayIndexOutOfBoundsException: Tentar acessar uma posicao que nao existe no array
		
		//static int [] arrayNull = new int[0];
		//System.out.println(arrayNull[1]);
		
		
		
		//* ClassCastException: Tentar realizar o cast entre objetos de classes diferentes que nao passam no teste "Eh um ..."
		
		//Animal a = new Galinha(); //Criando um animal do tipo galinha
		//Cachorro c = (Cachorro) a;//tentando realizar o cast (passar uma variavel do tipo cachorro) para uma variavel do tipo galinha
		
		
		
		//* NumberFormatException: Tentar converter uma string desconhecida (letras e caracteres especiais) para qualquer formato numerico
		
		//int inteiro = Integer.parseInt("x");
		

	}

}
