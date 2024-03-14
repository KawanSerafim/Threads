package view;

import javax.swing.JOptionPane;

import controller.ThreadTID;

public class Principal {

	public static void main (String [] args) {
		
		int opc = 0;
		
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n" + 
			
				"1 - Imprimir o TID de 5 Threads.\n" +
				"9 - Sair."));
			
			switch (opc) {
			
				case 1:
					
					for (int tidThread = 0; tidThread < 5; tidThread++) {
						
						Thread threadTID = new ThreadTID(tidThread);
						threadTID.start();
						
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
