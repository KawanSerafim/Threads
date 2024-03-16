package view;

import javax.swing.JOptionPane;

import controller.ThreadMatriz;
import controller.ThreadTID;

public class Principal {

	public static void main (String [] args) {
		
		int opc = 0;
		
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n" + 
			
				"1 - Imprimir o TID de 5 Threads.\n" +
				"2 - Imprimir a somatória de uma linha de uma matriz aleatória.\n" +
				"9 - Sair."));
			
			switch (opc) {
			
				case 1:
					
					for (int tidThread = 0; tidThread < 5; tidThread++) {
						
						Thread threadTID = new ThreadTID(tidThread);
						threadTID.start();
						
					}
					break;
					
				case 2:
					
					int matriz[][] = new int [3][5];
					int vetor[] = new int [5];
					
					for (int x = 0; x < 3; x++) {
						
						for (int y = 0; y < 5; y++) {
							
							matriz [x][y] = (int)(Math.random()*100) + 1;
							
							System.out.println("linha: " + (x + 1) + ", coluna: " + (y + 1) + " = " + matriz[x][y]);
						
						}
						
						
					}
					
					for (int matrizThread = 0; matrizThread < 3; matrizThread++) {
						
						for (int i = 0; i < 5; i++) {
							
							vetor[i] = matriz[matrizThread][i];
							
						}
						
						Thread threadMatriz = new ThreadMatriz(vetor);
						threadMatriz.start();
						
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
