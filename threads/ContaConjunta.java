package threads;

/**
 * Parte I
 * Classe criada para auxiliar o exemplo de uso de sincronização de threads
 * O objetivo será instanciar vários usuários acessando a mesma conta (as threads representam os usuários)
 * e ver como o java sincroniza os acessos.
 * @author Marcos Ribeiro
 */

public class ContaConjunta {
	
	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente) {
		if(saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			saldo -= valor;
			String msg = cliente + " SACOU " + valor + " [Saldo Original = " + saldoOriginal + ", Saldo Final = " + saldo + "]";
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
	}

}
