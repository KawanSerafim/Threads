package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread{
	
	private int pingThread;
	private int contador;
	
	public ThreadPing(int pingThread, int contador) {
		
		this.pingThread = pingThread;
		this.contador = contador;
	
	}

	@Override
	public void run() {
		
		String nomeSO = System.getProperty("os.name");
		
		if (nomeSO.contains("Linux")) {
			
			if (contador == 1) {
				
				try {
					
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					
					String linha = "";
					
					double tempoInicial = System.nanoTime();
					
					linha = buffer.readLine();
					
					while (linha != null) {
						
						System.out.println(linha);
						linha = buffer.readLine();
						
					}
					
					
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
				
			}
			else if (contador == 2) {
				
				try {
					
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.uol.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					
					String linha = "";
					
					double tempoInicial = System.nanoTime();
					
					linha = buffer.readLine();
					
					while (linha != null) {
						
						System.out.println(linha);
						linha = buffer.readLine();
						
					}
					
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
			
				
			} else {
				
				try {
					
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.terra.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					
					String linha = "";
					
					double tempoInicial = System.nanoTime();
					
					linha = buffer.readLine();
					
					while (linha != null) {
						
						System.out.println(linha);
						linha = buffer.readLine();
						
					}	
					
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		} else {
			
			if (contador == 1) {
				
				System.err.println("Não há versão para este sistema operacional.");
				contador++;
			
			}
				
		}
		
	}

}
