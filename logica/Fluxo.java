/**
 *Basico de Tomada de Decisao : Se, Entao, Senao Se, Senao
 *@author Marcos Ribeiro
 */

 public class Fluxo {
 
	public static void main (String[] args) {
		
		
		//Exemplo 1: determinar se a idade for menor do que 11 a pessoa eh uma crianca
		int idade = 18;
		if (idade < 11) {
			System.out.println("Eh uma crianca");
		}
				
		//Exemplo 2: se a pessoa passou no teste, entao eh contratada
		boolean passou = true;
		if (passou) {
			System.out.println("Contratado");
		}
		
		//Exemplo 3: verificar se numero eh par ou impar
		int numero = 11;
		if ((numero % 2) == 0) {
			System.out.println("Numero Par");
		} else {
			System.out.println("Numero Impar");
		}
		
		//Exemplo 4: verificar idade de uma pessoa
		int idade2 = 11;
		if (idade2 <= 11) {
			System.out.println("Crianca");
		} else if (idade2 > 11 && idade2 <= 18){
			System.out.println("Adolescente");
		} else  if (idade2 > 18 && idade2 <= 60){
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
		//Exemplo 5: media de aluno, aprovado ou reprovado
		int nota = 6;
		if (nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("Reprovou");
			if (nota >= 6) {
				System.out.println ("Mas pode fazer a recuperacao");
			}
		}
	
	}
 }