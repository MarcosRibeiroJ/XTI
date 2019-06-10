package threads;

/**
 * Classe criada para apresentar o conceito de Thread
 * As threads são processos que ocorrem em um programa quando este está em execução
 * Nesse exemplo as threads são criadas implementando a interface runnable
 * @author Marcos Ribeiro
 */

public class PingPongRunnable implements Runnable {
	
	String palavra;
	long tempo;
	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(palavra);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		
		Runnable ping = new PingPongRunnable("Ping", 1500);
		Runnable pong = new PingPongRunnable("Pong", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();

	}

}
