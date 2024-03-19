package view;

import javax.swing.JOptionPane;
import controller.*;

public class Principal {

	public static void main (String [] args) {
		
		int opc = 0;
		
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n" + 
			
				"1 - Imprimir o TID de 5 Threads.\n" +
				"2 - Imprimir a somatória de uma linha de uma matriz aleatória.\n" +
				"3 - Imprimir o tempo para For e/ou Foreach.\n" +
				"4 - Corrida de sapos.\n" +
				"9 - Sair."));
			
			switch (opc) {
			
				case 1:
					
					for (int tidThread = 0; tidThread < 5; tidThread++) {
						
						Thread threadTID = new ThreadTID(tidThread);
						threadTID.start();
						
					}
					break;
					
				case 2:
					
					int matriz1[][] = new int [3][5];
					int vetor1[] = new int [5];
					
					for (int x = 0; x < 3; x++) {
						
						for (int y = 0; y < 5; y++) {
							
							matriz1 [x][y] = (int)(Math.random()*100) + 1;
							
							System.out.println("linha: " + (x + 1) + ", coluna: " + (y + 1) + " = " + matriz1[x][y]);
						
						}
						
						
					}
					
					for (int matrizThread = 0; matrizThread < 3; matrizThread++) {
						
						for (int i = 0; i < 5; i++) {
							
							vetor1[i] = matriz1[matrizThread][i];
							
						}
						
						Thread threadMatriz = new ThreadMatriz(vetor1);
						threadMatriz.start();
						
					}
					break;
					
				case 3:
					
					int vetor2[] = new int [1000];
					int numAleatorio = 0;
					
					for (int vetorThread = 0; vetorThread < 2; vetorThread++) {
						
						numAleatorio = (int)(Math.random()*100) + 1;
						Thread threadVetor = new ThreadVetor(numAleatorio, vetor2);
						threadVetor.start();
						
					}
					break;
					
				case 4:
					
					int distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da pista de corrida em metros."));
					
					for (int sapoThread = 0; sapoThread < 5; sapoThread++) {
						
						Thread threadSapo = new ThreadSapo(sapoThread, distancia);
						threadSapo.start();
						
					}
					break;
					
				case 9:
					
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				
				default:
					
					JOptionPane.showMessageDialog(null, "Essa opção não existe. Digite novamente.");
					
			}
			
		}
		
	}
	
}
