/**
 *Basico de Tomada de Decisao : Se, Entao, Senao Se, Senao e switch
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
		
		/**Aula 24 - Switch case*/
		
		System.out.println("\n\nAula 24\n");
		
		
		//Exemplo 1: De acordo com o sexo imprimir uma mensagem na tela
		char sexo = 'M';
		
		switch (sexo) {
			case 'M':
				System.out.println("Macho");
				break;
			case 'F':
				System.out.println("Femea");
				break;
			default:
				System.out.println("Outro");
		}
		
		//Exemplo 2: Tipos de Tecnologia
		
		String tecnologia = "postgresql";
		
		switch (tecnologia) {
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Linguagem de Programacao");
				break;
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Banco de Dados");
				break;
			default:
				System.out.println("Tecnologia desconhecida");
		}
		
	}//fim do metodo main
 }//fim da classe