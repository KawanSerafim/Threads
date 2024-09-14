package controller;

public class ThreadMatriz extends Thread {

	private int[][] matriz;
	private int id;
	private static int proximo = 1;

	public ThreadMatriz(int[][] matriz, int id) {
		
		this.matriz = matriz;
		this.id = id;
		
	}
	
	@Override
	public void run() {
		
		somatoria(encherVetor());
	
	}

	private int[] encherVetor() {
		
		int[] linha = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			linha[i] = matriz[proximo][i];
			
		}
		
		return linha;
		
	}

	private void somatoria(int[] linha) {
		
		int somatoria = 0;
		
		for(int i = 0; i < 5; i++) {
			
			somatoria += linha[i];
			
		}
		
		System.out.println("Thread: " + id + " - Somatória = " + somatoria);
		
	}
	
}
