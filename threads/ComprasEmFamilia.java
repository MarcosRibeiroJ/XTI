package threads;

/**
 * Parte II
 * Classe criada para auxiliar o exemplo de uso de sincronização de threads
 * O objetivo será instanciar vários usuários acessando a mesma conta (as threads representam os usuários)
 * e ver como o java sincroniza os acessos.
 * @author Marcos Ribeiro
 */

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Babá").start();
	}
	
	@Override
	public void run() {
		String cliente = Thread.currentThread().getName();
		for(int i=0; i < 5; i++) {
			conta.sacar(20, cliente);
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		}
		
		
	}

}
