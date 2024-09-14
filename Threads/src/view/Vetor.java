package view;

import controller.ThreadVetor;

public class Vetor {

	public Vetor() {
		
		super();
		
	}
	
	public void chamarThread() {
		
		for(int vetorThread = 0; vetorThread < 2; vetorThread++) {
			
			int parametro = (int)((Math.random() * 101) + 0);
			Thread threadVetor = new ThreadVetor(vetorThread, gerarVetor(), parametro);
			threadVetor.start();
			
			
		}
		
	}
	
	private int[] gerarVetor() {
		
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000; i++)
			vetor[i] = (int)((Math.random()*101) + 1);
		
		return vetor;
			
	}
	
}
