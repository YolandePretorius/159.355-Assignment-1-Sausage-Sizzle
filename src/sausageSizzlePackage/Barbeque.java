package sausageSizzlePackage;

	

public class Barbeque implements Runnable {
	
	SausageStand stand;
	
	public Barbeque(SausageStand s) {
		stand = s;
	}
	
	
	public void run() {
		for (int i = 0; i < 5; i++) {
		System.out.println("Current Thread running: "+Thread.currentThread().getName());
		SausageStand.ProduceSausage(i);
		}
	}


	

}
