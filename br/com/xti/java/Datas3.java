package br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Classe criada para apresentar os conceitos de internacionalização de datas em java, ou seja, como definir o idioma e país para apresentação de uma data
 * @author Marcos Ribeiro
 */

public class Datas3 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();//criando uma instancia de um calendario
		c.set(1980, Calendar.FEBRUARY, 12);//definindo a data da instancia
		Date date = c.getTime();//recuperando um objeto do tipo Date a partir da instancia definida
		
		/**Definir idioma e país*/
		
		//Lingua definida na ISO 639 e país definido na ISO 3166
		
		Locale padrao = Locale.getDefault();//objeto padrao para definir idioma e país, por default o java utiliza as mesmas do sistema operacional
		Locale brasil = new Locale("pt", "BR");//nesse exemplo estou criando um objeto do tipo Locale ja definindo o idioma para portugues e o país Brasil
		Locale india = new Locale("hi", "IN");//nesse exemplo estou criando um objeto do tipo Locale ja definindo o idioma para hindi e o país India
		Locale eua = Locale.US;//nesse exemplo estou criando um objeto do tipo Locale ja com uma constante para o idioma dos EUA
		Locale japao = Locale.JAPAN;//nesse exemplo estou criando um objeto do tipo Locale ja com uma constante para o idioma do Japao
		Locale italia = Locale.ITALY;//nesse exemplo estou criando um objeto do tipo Locale ja com uma constante para o idioma da Italia
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);//criando uma instancia de formatacao com o padrao completo definido
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
		//Brasil
		
		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);//criando uma instancia de formatacao com o padrao completo definido e passando como parametro a formatacao de país e idioma atraves do objeto Locale
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
		//India
		
		f = DateFormat.getDateInstance(DateFormat.FULL, india);//criando uma instancia de formatacao com o padrao completo definido e passando como parametro a formatacao de país e idioma atraves do objeto Locale
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
		//EUA
		
		f = DateFormat.getDateInstance(DateFormat.FULL, eua);//criando uma instancia de formatacao com o padrao completo definido e passando como parametro a formatacao de país e idioma atraves do objeto Locale
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
		//Japao
		
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);//criando uma instancia de formatacao com o padrao completo definido e passando como parametro a formatacao de país e idioma atraves do objeto Locale
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
		//Italia
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);//criando uma instancia de formatacao com o padrao completo definido e passando como parametro a formatacao de país e idioma atraves do objeto Locale
		System.out.println(f.format(date));//imprimindo o objeto do tipo date ja formatado conforme o padrao definido
		
	}

}
