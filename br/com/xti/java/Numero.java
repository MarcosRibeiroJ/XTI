package br.com.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Classe criada para apresentar a classe NumberFormat, utilizada para formatar numeros
 * Nesse programa utilizo exemplos de formatacao para numeros, conversao de string em double e internacionalizacao da formatacao de numeros
 * @author Marcos Ribeiro
 */

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123456.789;
		
		/**Formatacao de Numeros*/
		
		NumberFormat f = NumberFormat.getInstance();//criando uma instancia de um formatador para numeros
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		f = NumberFormat.getIntegerInstance();//criando uma instancia de um formatador para numeros inteiros
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		f = NumberFormat.getPercentInstance();//criando uma instancia de um formatador para numeros percentuais
		System.out.println(f.format(0.25));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro um double
		
		f = NumberFormat.getCurrencyInstance();//criando uma instancia de um formatador para numeros monetarios
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		f.setMaximumFractionDigits(3);//definindo o valor maximo de casas decimais
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		/**Internacionalizacao de numeros*/
		
		f = NumberFormat.getCurrencyInstance(Locale.US);//criando uma instancia de um formatador para numeros monetarios no padrao norte americano
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);//criando uma instancia de um formatador para numeros monetarios no padrao frances
		System.out.println(f.format(saldo));//utilizando o metodo de formatacao padrao (utiliza o locale do sistema operacional), passando como parametro a variavel double criada
		
		/**Convertendo uma string em double (Parse)*/
		
		f = NumberFormat.getCurrencyInstance();//criando uma instancia de um formatador para numeros monetarios
		System.out.println(f.parse("R$ 1.100,25"));//convertendo uma string em um double
	}

}
