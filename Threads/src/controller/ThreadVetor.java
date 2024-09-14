package controller;

public class ThreadVetor extends Thread {
	
	private int id;
	private int[] vetor;
	private int parametro;
	private double tempo1;
	private double tempo2;
	
	public ThreadVetor(int id, int[] vetor, int parametro) {
		
		this.id = id;
		this.vetor = vetor;
		this.parametro = parametro;
		
	}
	
	@Override
	public void run() {
		
		contabilizarTempo();
	
	}
	
	private void contabilizarTempo() {
		
		parametro %= 2;
		
		switch(parametro) {
		
			case 0:
				
				tempo1 = System.nanoTime();
				
				for(int i = 0; i < vetor.length; i++);
					
				tempo2 = System.nanoTime();
				
				System.out.println("Thread: " + id + " - Tempo pelo For: " + ((tempo2 - tempo1)/1000) + " nanosegundos.");
				
				break;
				
			case 1:
				
				tempo1 = System.nanoTime();
				
				for(@SuppressWarnings("unused") int i : vetor);
					
				tempo2 = System.nanoTime();
				
				System.out.println("Thread: " + id + " - Tempo pelo Foreach: " + ((tempo2 - tempo1)/1000) + " nanosegundos.");
				
				break;
				
		
		}
		
	}

}
