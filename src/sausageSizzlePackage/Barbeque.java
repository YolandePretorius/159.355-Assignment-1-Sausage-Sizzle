package sausageSizzlePackage;

	

public class Barbeque implements Runnable {
	
	SausageStand stand;
	
	public Barbeque(SausageStand s) {
		stand = s;
	}
	
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
		System.out.println("BBQ name: "+Thread.currentThread().getName());
		SausageStand.ProduceSausage(i);
		System.out.println(" ");
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


	

}
