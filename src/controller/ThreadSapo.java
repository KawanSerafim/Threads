package controller;

import java.util.concurrent.Semaphore;

public class ThreadSapo extends Thread {

	private int sapoThread;
	private int distThread;
	private static int indice = 0;
	private static int posicao[] = new int[5];
	private Semaphore semaforo;
	
	public ThreadSapo (int sapoThread, int distThread, Semaphore semaforo) {
		
		this.sapoThread = sapoThread;
		this.distThread = distThread;
		this.semaforo = semaforo;
		
	}
	
	@Override
	public void run() {
		
		int salto = 0;
		
		while (sapoThread < distThread) {
			
			salto = (int)(Math.random()*3) + 0;
			sapoThread += salto;
			
			System.out.println("Sapo: " + getId() + " - Percorreu: " + sapoThread + 
				"m de " + distThread + "m");
			
		}
		
		try {
			
			semaforo.acquire();
			posicao[indice] = (int)(getId());
		
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		} finally {
			
			semaforo.release();
			
		}
		
		if (indice == 4) {
			
			System.out.println("\n\n=====================\n\nPODIO\n\n");
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Sapo: " + posicao[i] + " - chegou em " + (i+1) + "º lugar.");
				
			}
			
			System.out.println("\n\n=====================");
			
		} else {
			
			indice++;
			
		}
		
	}
	
}
