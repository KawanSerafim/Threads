package view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try {
			
			int opc = 0;
			
			do {
				
				opc = Integer.parseInt(JOptionPane.showInputDialog(
						"[Threads - Sistemas Operacionais 1]\n\n" +
						"1 - Exibir o TID de 5 threads.\n" +
						"2 - Exibir a somatória de cada linha de uma matriz.\n" +
						"3 - Exibir o tempo que uma thread percorre um vetor.\n" +
						"0 - Sair."));
				
				switch(opc) {
				
					case 1:
						
						Tid tid = new Tid();
						tid.chamarThreads();
						break;
						
					case 2:
						
						Matriz matriz = new Matriz();
						matriz.chamarThread();
						break;
						
					case 3:
						
						Vetor vetor = new Vetor();
						vetor.chamarThread();
						break;
						
					case 0:
						
						break;
						
					default:
						
						JOptionPane.showMessageDialog(null, "Input inválido.");
				
				}
				
			} while(opc != 0);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}