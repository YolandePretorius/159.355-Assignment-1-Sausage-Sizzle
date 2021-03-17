package sausageSizzlePackage;

	

public class Barbeque implements Runnable {
	
	SausageStand stand;
	
	public Barbeque(SausageStand s) {
		stand = s;
	}
	
	
	public void run() {
		System.out.println("Current Thread running: "+Thread.currentThread().getName());
		SausageStand.ProduceSausage();
	}


	

}
