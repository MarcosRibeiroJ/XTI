package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe criada para apresentar os conceitos basicos de manipulacao de datas em Java utilizando as classes Date e Calendar nos exemplos
 * @author Marcos Ribeiro
 */

public class Datas {

	public static void main(String[] args) {
		
		/**Criando um objeto do tipo date*/
		
		System.out.println(System.currentTimeMillis());//imprime qntos milissegundos passaram desde 01/01/1970
		
		Date dataAtual = new Date();//criando um objeto do tipo Date que recebe a data atual (padrao do construtor vazio)
		System.out.println(dataAtual);
		
		Date data = new Date(1496000000000L);//criando um objeto do tipo date passando como parametro um long representando uma data em milissegundos
		System.out.println(data);
		
		/**Metodos da classe Date que posso utilizar*/
		
		data.getTime();//retorna o valor de uma data em milissegundos
		data.setTime(1497000000000L);//modifica uma data (devo passar a nova data como um long em milissegundos)
		System.out.println(data);//imprimindo o valor da nova data
		System.out.println(data.compareTo(dataAtual));//metodo que compara datas e retorna -1 se a data for anterior, 0 se forem iguais ou 1 se for maior
		
		/**Manipulando datas*/
		
		Calendar c = Calendar.getInstance();//cria uma instancia de um calendario gregoriano (tbm eh possivel criar uma mesma instancia usando new GregorianCalendar)
		c.set(1990, Calendar.JANUARY, 24);//adicionando uma data ao calendario
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		System.out.println(c.get(Calendar.YEAR));//retorna o ano de uma data
		System.out.println(c.get(Calendar.MONTH));//retorna o mes de uma data (conta os meses de 0 ate 11)
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//retorna o dia de uma data
		
		c.set(Calendar.YEAR, 1980);//altera o ano para 1980 o ano de uma data
		c.set(Calendar.MONTH, Calendar.FEBRUARY);//altera o mes para fevereiro
		c.set(Calendar.DAY_OF_MONTH, 15);//altera o dia para 15
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		c.clear(Calendar.MINUTE);//limpa o campo de minuto da data
		c.clear(Calendar.SECOND);//limpa o campo de segundo da data
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		c.add(Calendar.DAY_OF_MONTH, 1);//adiciona um dia a data
		c.add(Calendar.YEAR, 1);//adiciona um ano a data
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		c.add(Calendar.DAY_OF_MONTH, -1);//retrocede um dia a data
		c.add(Calendar.YEAR, -1);//retrocede um ano a data
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		c.add(Calendar.DAY_OF_MONTH, 20);//metodo add quando adiciono 20 dias ele continua a contagem no proximo mes
		c.roll(Calendar.DAY_OF_MONTH, 30);//metodo roll quando adiciono 30 dias nao muda a contagem para o proximo mes, altera somente os valores do dia
		System.out.println(c.getTime());//nesse caso o metodo getTime retorna um objeto do tipo Date (e nao um long como no exemplo anterior)
		
		/**Exemplo: Exibir uma mensagem de saudacao conforme o horario (Bom dia <= 12, Boa Tarde >12 && <=18 e Boa Noite >18)*/
		
		Calendar c1 = Calendar.getInstance();//criando uma instancia de calendario gregoriano
		int hora = c1.get(Calendar.HOUR_OF_DAY);//retornando a hora atual desse calendario
		System.out.println(hora);
		if(hora <= 12) {
			System.out.println("Bom Dia");
		} else if(hora > 12 && hora < 18) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
	}

}
