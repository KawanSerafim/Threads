package controller;

public class ThreadSapo extends Thread {

	private int sapoThread;
	private int distThread;
	
	public ThreadSapo (int sapoThread, int distThread) {
		
		this.sapoThread = sapoThread;
		this.distThread = distThread;
		
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
		
		
		
	}
	
}
