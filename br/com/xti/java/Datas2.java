package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe criada para apresentar as duas principais classes utilizadas para formatar datas: DateFormat e SimpleDateFormat
 * @author Marcos Ribeiro
 */

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();//criando uma instancia de um calendario
		c.set(1980, Calendar.FEBRUARY, 12);//passando os valores para a data
		Date data = c.getTime();//recuperando um objeto do tipo Date com a data definida
		System.out.println(data);
		
		/**Formatacao de datas*/
		
		DateFormat f = DateFormat.getDateInstance();//criando uma instancia de formatacao de data
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string formatada no padrao dd/mm/aaaa
		
		/**Formatacao de horas*/
		
		f = DateFormat.getTimeInstance();//criando uma instancia de formatacao de horas
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a hora em string formatada no padrao hh:mm:ss
		
		/**Formatacao de data e horas*/
		
		f = DateFormat.getDateTimeInstance();//criando uma instancia de formatacao de data e horas
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string e a hora formatada no padrao dd/mm/aaaa hh:mm:ss
		
		/**Estilos de data*/
		
		f = DateFormat.getDateInstance(DateFormat.FULL);//criando uma instancia de formatacao de data definindo o formato de data (Exemplo: Terça-feira, 12 de Fevereiro de 1980)
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string conforme o estilo definido
		
		f = DateFormat.getDateInstance(DateFormat.LONG);//criando uma instancia de formatacao de data definindo o formato de data (Exemplo: 12 de Fevereiro de 1980)
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string conforme o estilo definido
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);//criando uma instancia de formatacao de data definindo o formato de data (Exemplo: 12/02/1980)
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string conforme o estilo definido
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);//criando uma instancia de formatacao de data definindo o formato de data (Exemplo: 12/02/80)
		System.out.println(f.format(data));//metodo que recebe um objeto do tipo Date e retorna a data em string conforme o estilo definido
		
		/**Convertendo uma string em objeto Date*/
		
		Date data2 = f.parse("24/01/1990");//armazenando o resultado da conversao em um novo objeto do tipo Date
		System.out.println(data2);
		
		/**SimpleDateFormat - Classe mais simples para formatacao de datas*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//criando uma instancia de formatacao de data ja definindo qual sera o padrao de formatacao
		System.out.println(sdf.format(data2));//formatando um objeto do tipo Date de acordo com o formato que defini
		System.out.println(sdf.parse("15/01/1990"));//convertendo uma string em um objeto do tipo Date
	}

}
