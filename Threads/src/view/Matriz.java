package view;

import controller.ThreadMatriz;

public class Matriz {

	public Matriz() {
		
		super();
		
	}
	
	public void chamarThread() {
		
		for(int matrizThread = 0; matrizThread < 3; matrizThread++) {
			
			Thread threadMatriz = new ThreadMatriz(gerarMatriz(), matrizThread);
			threadMatriz.start();
			
		}
		
	}
	
	private int[][] gerarMatriz() {
		
		int[][] matriz = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				matriz[i][j] = (int)((Math.random() * 1001) + 0);
				
			}
			
		}
		
		return matriz;
		
	}
	
}