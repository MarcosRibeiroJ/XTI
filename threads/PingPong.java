package threads;

/**
 * Classe criada para apresentar o conceito de Thread
 * As threads são processos que ocorrem em um programa quando este está em execução
 * @author Marcos Ribeiro
 */

public class PingPong extends Thread {
	
	String palavra;
	long tempo;
	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(palavra);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		
		new PingPong("Ping", 1500).start();
		new PingPong("Pong", 2000).start();
		System.out.println("Ver Thread");

	}

}
