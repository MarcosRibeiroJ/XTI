package br.com.xti.erros;

/**
 * Classe criada para testar uma exception de uma senha digitada incorretamente
 * @author Marcos Ribeiro
 */

public class SenhaTest {

	//metodo que autentica uma senha digitada
	static void autenticar(String senha) throws SenhaInvalidaException {//informando que esse metodo pode gerar uma exception do tipo SenhaInvalidaException
		if("123".equals(senha)) {
			//autenticou
			System.out.println("Autenticado");
		} else {
			//nao autenticou
			throw new SenhaInvalidaException("Senha Incorreta");//caso a senha seja digitada incorretamente, criar um objeto do tipo SenhaInvalidaException passando uma mensagem de erro
		}
	}
	
	public static void main(String[] args) {
		
		try {
			autenticar("marcos");//chamando o metodo autenticar passando uma senha
			
		} catch(SenhaInvalidaException e) { //caso senha incorreta capturar a exception SenhaInvalidaException
			e.printStackTrace();//imprimir o caminho do erro
			System.out.println(e.getMessage());//imprimir a mensagem de erro
		}

	}

}
