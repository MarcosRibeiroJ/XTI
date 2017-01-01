/**
 * Empacotar e Desempacotar (AutoBoxing)
 *@author Marcos Ribeiro
 */


public class AutoBoxing {

	public static void main(String[] args){
		
		
		//Emxemplo 1: Como incrementar no valor de um inteiro encapsulado em uma classe (forma antiga, ate a versao 4 do Java)
		
		Integer x = new Integer(555);//Criando um objeto inteiro encapsulado numa classe Integer (empacotando)
		int a = x.intValue();// reagatando o valor inteiro do objeto e armazenando numa variavel primitiva de inteiros (desempacotando)
		a++;//incrementando o valor
		x = new Integer(a);//re-empacotando
		System.out.println(x.intValue());//imprimir o valor utilizando o metodo para resgatar o valor do objeto encapsulado
		
		//Emxemplo 2: Como incrementar no valor de um inteiro encapsulado em uma classe (forma nova, a partir da versao 5 do Java)
		
		Integer y = 555;//Criando um objeto inteiro encapsulado numa classe Integer (empacotando)
		y++;//Desempacotando, incrementando e re-empacotando
		System.out.println(y);//Imprimindo o valor
		
		//Emxemplo 3: Valores booleanos utilizados dentro de uma estrutura condicional (if)
		
		Boolean v = new Boolean("true");//criando um objeto do tipo booleano e passando uma string no valor dele
		if(v){//convertendo automaticamente a string em booleano e comparando no if
			System.out.println(v);//imprimindo o valor do objeto booleano
		}
	
	}//final do metodo main
}//final da classe