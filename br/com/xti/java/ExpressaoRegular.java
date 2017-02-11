package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe criada para apresentar os conceitos de Expressoes Regulares (regex ou re)
 * Expressoes regulares sao utilizadas para localizar padroes em textos ou strings
 * Sao codigos que representam letras, numeros, caracteres especiais, etc
 * Podemos utilizar para substituir, formatar, alterar textos ou separa-los formando novos caracteres
 * Nesse arquivo veremos:
 * Modificadores, Metacaracteres, Quantificadores, Metacaracteres de Fronteira,
 * Agrupadores, Classe Pattern e substituições utilizando a classe pattern 
 * @author Marcos Ribeiro
 */

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		
		//Expressoes regulares sao padroes para textos, um exemplo simples onde temos um texto e o padrao eh o proprio texto
		boolean b = "Java".matches("Java"); //metodo matches pesquisa em uma string um padrao apresentado em forma de expressao regular
		System.out.println("Comparando Java com Java: " + b);
		b = "Java".matches("java");
		System.out.println("Comparando Java com java: " + b);
		
		/**MODIFICADORES*/
		
		// (?i) => Ignora maiuscula e minuscula
		// (?x) => Reconhece Comentarios
		// (?m) => Trabalha com Multilinhas (multiplas linhas)
		// (?s) => Dottal
		
		b = "Java".matches("(?i)java");
		System.out.println("Comparando Java com java usando (?i): " + b);
		
		/**METACARACTERES*/
		
		// . => qualquer caracter
		// \d => digito    [0-9]
		// \D => Nao eh digito    [^0-9]
		// \s => Espacos    [ \t\n\x0B\f\r]
		// \S => Nao eh espaco    [^\s]
		// \w => Letras e numeros    [a-zA-Z_0-9]
		// \W => Nao eh letra
		
		b = "@".matches(".");
		System.out.println("Verificando se texto tem somente um caracter: " + b);
		b = "2".matches("\\d");
		System.out.println("Verificando se texto eh um numero de 0 a 9: " + b);
		b = "a".matches("\\w");
		System.out.println("Verificando se texto eh um numero de 0 a 9 ou uma letra de a-z: " + b);
		b = " ".matches("\\s");
		System.out.println("Verificando se texto eh um espaco em branco: " + b);
		b = "@&".matches("..");//para cada caracter avaliado, preciso de um metacaracter
		System.out.println("Verificando se texto @& eh composto por dois caracteres: " + b);
		
		//validando cep I - (expressao regular maior sem quantificadores)
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "13460-000".matches(cep);
		System.out.println("Verificando se o cep fornecido eh valido I: " + b);
		
		/**QUANTIFICADORES*/

		// X{n}     X, exatamente n vezes
		// X{n,}    X, pelo menos n vezes
		// X{n,m}  X, pelo menos n mas nao mais do que m vezes
		// X?       X, 0 ou 1 vez
		// X*       X, 0 ou + vezes
		// X+       X, 1 ou + vezes
		
		b = "27".matches("\\d{2}");
		System.out.println("Verificando se texto eh composto de dois numeros: " + b);
		b = "2401".matches("\\d{2,}");
		System.out.println("Verificando se texto eh composto de pelo menos dois numeros: " + b);
		b = "240190".matches("\\d{2,6}");
		System.out.println("Verificando se texto eh composto de pelo menos dois numeros e no maximo seis numeros: " + b);
		b = "".matches(".?");//0 ou 1
		System.out.println("Verificando se texto eh composto de 0 ou 1 caracter: " + b);
		b = "abc".matches(".*");//0 ou +
		System.out.println("Verificando se texto eh composto de 0 ou + caracteres: " + b);
		b = "abcde".matches(".+");//1 ou +
		System.out.println("Verificando se texto eh composto de 1 ou + caracteres: " + b);
		
		//validando cep II - (expressao regular com quantificadores)
		
		b = "13460-000".matches("\\d{5}-\\d{3}");
		System.out.println("Verificando se o cep fornecido eh valido II: " + b);
		
		//validando data
		
		b = "24/01/1990".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println("Verificando se a data fornecida eh valida: " + b);
		
		/**METACARACTER DE FRONTEIRA*/

		// ^ inicia
		// $ finaliza
		// | ou
		
		b = "Sherlock Holmes".matches("^Sherlock.*");//texto comeca com Sherlock (^Sherlock) e em seguida pesquiso qualquer caracter (.) que apareca 0 ou mais vezes (*)
		System.out.println("Texto comeca com Sherlock: " + b);
		
		b = "Sherlock Holmes".matches(".*Holmes$");//texto tem qualquer caracter no comeco (.) que aparece 0 ou mais vezes (*) e termina com Holmes (Holmes$)
		System.out.println("Texto termina com Holmes: " + b);
		
		b = "O grande detetive Sherlock Holmes que mora na 221b Baker Street".matches(".*Sherlock Holmes.*");//texto tem qualquer caracter no comeco (.) que aparece 0 ou mais vezes (*) em seguida tem Sherlock Holmes, logo apos tem novamente qualquer caracter (.) que aparece 0 ou mais vezes (*)
		System.out.println("Texto tem Sherlock Holmes no meio da frase: " + b);
		
		b = "O grande detetive Sherlock Holmes que mora na 221b Baker Street".matches("^O.*Street$");
		System.out.println("Texto comeca com O e termina com Street: " + b);
		
		b = "sim".matches("sim|não");//texto contem sim ou (|) nao
		System.out.println("Texto contem sim ou nao: " + b);
		
		/**AGRUPADORES*/

		// [...]            Agrupamento
		// [a-z]            Alcance
		// [a-e][i-u]       Uniao
		// [a-z&&[aeiou]]   Intersecao
		// [^abc]           Excecao
		// [a-z&&[^m-p]]    Subtracao
		// \x               Fuga literal
		
		b = "x".matches("[a-z]");//validar qualquer letra minuscula de a ate z
		System.out.println("Texto eh uma letra de a ate z: " + b);
		b = "3".matches("[0-5]");//validar qualquer numero de 0 ate 5
		System.out.println("Texto eh um numero de 0 ate 5: " + b);
		b = "Marcos".matches("[Mm]arcos");//validar letra maiuscula ou minuscula
		System.out.println("Texto contem Marcos ou marcos: " + b);
		b = "Marcos".matches("[Mm]arcos|[rR]ibeiro");//validar se texto contem marcos ou ribeiro podendo ter a primeira letra maiuscula ou minuscula
		System.out.println("Texto contem marcos ou ribeiro podendo ter a primeira letra maiuscula ou minuscula: " + b);
		b = "Marcos".matches("[A-Z][a-z]*");//texto sempre comeca com letra maiuscula e as demais letras minusculas
		System.out.println("Texto sempre comeca com letra maiuscula e as demais letras minusculas: " + b);
		b = "Marcos".matches("[^0-9]*");//texto nao pode comecar com numeral
		System.out.println("Texto nao pode comecar com numeral: " + b);
		
		//validacao de email
		
		// \\w(pode ter letras e numeros)+(uma ou mais vezes)@(seguido de @)\\w{2,}(seguido de letras e numeros, pelo menos dois caracteres)\\.(seguido de ponto .)\\w{2,}(seguido de letras e numeros, pelo menos dois caracteres).*(seguido de qualquer caracter podendo ser de 0 ate n caracteres)
		b = "marcossrj90@gmail.com".matches("\\w+@\\w{2,}\\.\\w{2,}.*");
		System.out.println("Texto nao pode comecar com numeral: " + b);
		
		
		/**CLASSE PATTERN*/
		
		System.out.println("\n\nCLASSE PATTERN\n");
				
		String doce = "Qual eh o Doce mais doCe que o doce?";
		
		
		//O Pattern.compile deve ser usado quando queremos utilizar a mesma regex mais de uma vez
		//nesse caso sera criado um objeto com a regex ja preparada para ser utilizada
		//criando um objeto matcher que recebe um outro objeto do tipo pattern
		//utilizamos o metodo matcher para validar no texto a regex criada
		//criamos um laço que busca e imprime todos os casos compativeis com a regex
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
		/**CLASSE PATTERN - SUBSTITUIÇÕES*/
		
		//Substituir uma palavra escrita de varias formas diferentes por outra palavra padrao
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		//Substituir um trecho de palavra por outro
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("[rR].{1}", "XX");
		System.out.println(r);
		
		//Substituir espaco em branco por um caracter de porcentagem
		r = "Tabular o texto".replaceAll("\\s", " % ");
		System.out.println(r);
		
		
		//Localizar padrao de link de site e substituir por outro padrao novo
		
		String url = "www.xti.com.br/clientes-2011.html";//link antigo
		
		            //http://www.xti.com.br/2011/clientes.jsp link novo
		
		//usamos () na regex quando queremos transformar um trecho da string em uma variavel, que depois pode ser utilizada
		//nesse exemplo, separamos:
		//(www.xti.com.br) = primeira variavel $1
		//(\\w{2,}) = segunda variavel $2
		//(\\d{4}) = terceira variavel $3
		//sempre o numero da variavel eh de acordo com sua posicao, sendo primeira $1, segunda $2 e assim por diante
		
		String re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";//re pra localizar o padrao do link antigo
		
		//criamos uma variavel para receber o texto novo
		//nesse caso o replaceAll recebe a re que localiza e separa trechos da string em variaveis ($1, $2, $3)
		//e a nova regex que usa as variaveis separadas usando o $
		
		String linkNovo = url.replaceAll(re, "http://$1/$3/$2.jsp");
		
		System.out.println(url);
		System.out.println(linkNovo);
		
		
	}

}
