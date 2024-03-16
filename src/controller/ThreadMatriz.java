package controller;

public class ThreadMatriz extends Thread {

	private int vetorThread[];
	
	public ThreadMatriz (int vetorThread[]) {
		
		this.vetorThread = vetorThread;
	
	}
	
	@Override
	public void run() {
		
		int somatoria = 0;
		
		for (int i = 0; i < 5; i++) {
			
			somatoria += vetorThread[i];
			
		}
		
		System.out.println(getId() + " " + somatoria);
		
	}
	
}
