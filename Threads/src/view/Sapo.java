package view;

import javax.swing.JOptionPane;

import controller.ThreadSapo;

public class Sapo {

	public Sapo() {
		
		super();
		
	}
	
	public void chamarThread() {
		
		int distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da pista de corrida."));
		
		for(int sapoThread = 0; sapoThread < 5; sapoThread++) {
			
			Thread threadSapo = new ThreadSapo(sapoThread, distancia);
			threadSapo.start();
			
		}
		
	}
	
}