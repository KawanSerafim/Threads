package controller;

public class ThreadVetor extends Thread{

	private int vetorThread[];
	private int numAleatorio;
	
	public ThreadVetor (int numAleatorio, int vetorThread[]) {
		
		this.vetorThread = vetorThread;
		this.numAleatorio = numAleatorio;
		
	}
	
	@Override
	public void run() {
		
		if (numAleatorio % 2 == 0) {
			
			double tempoInicial = System.nanoTime();
			
			for (int i = 0; i < vetorThread.length; i++) {}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal /= Math.pow(10, 9);
			
			System.out.println("TID: " + getId() + " - O tempo para For deu: " + tempoTotal);
			
		}
		else {
			
			double tempoInicial = System.nanoTime();
			
			for (int vetor : vetorThread) {}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal /= Math.pow(10, 9);
			
			System.out.println("TID: " + getId() + " - O tempo para Foreach deu: " + tempoTotal);
			
		}
	
	}
	
}
