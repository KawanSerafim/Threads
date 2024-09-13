package controller;

public class ThreadTid extends Thread{
	
	private int threadTid;
	
	public ThreadTid(int threadTid) {
		
		this.threadTid = threadTid;
		
	}
	
	@Override
	public void run() {
		
		exibirId();
		
	}

	private void exibirId() {
		
		System.out.println(threadTid);
		
	}
	
}