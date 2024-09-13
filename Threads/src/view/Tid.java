package view;

import controller.ThreadTid;

public class Tid {

	public Tid() {
		
		super();
		
	}
	
	public void chamarThreads() {
		
		for(int tidThread = 0; tidThread < 5; tidThread++) {
			
			Thread threadTid = new ThreadTid(tidThread);
			threadTid.start();
			
		}
		
	}
	
}