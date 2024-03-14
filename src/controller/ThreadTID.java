package controller;

public class ThreadTID extends Thread {
	
	private int tidThread;
	
	public ThreadTID (int tidThread) {
		
		this.tidThread = tidThread;
		
	}
	
	@Override
	public void run() {
		
		System.out.println(getId());
	
	}
	
}
