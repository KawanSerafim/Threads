package controller;

public class ThreadSapo extends Thread{

	private int id;
	private int salto;
	private int distancia;
	private static int posicaoFinal;
	private int posicaoAtual;
	
	public ThreadSapo(int id, int distancia) {
		
		this.id = id;
		this.distancia = distancia;
		
	}
	
	@Override
	public void run() {
	
		corrida();
	
	}

	private void corrida() {
		
		while(posicaoAtual < distancia) {
			
			salto = salto();
			posicaoAtual += salto;
			System.out.println("Sapo: " + id + " saltou: " + salto + " metros, estando em " + 
					posicaoAtual + " metros de " + distancia + " metros.");
			
		}
		
		posicaoFinal++;
		System.out.println("\n==============================================================\n\n" +
				"Sapo: " + id + " chegou em " + posicaoFinal + "º lugar." +
				"\n\n==============================================================\n");
		
	}
	
	private int salto() {
		
		return (int)((Math.random() * 5) + 1);
		
	}
	
}