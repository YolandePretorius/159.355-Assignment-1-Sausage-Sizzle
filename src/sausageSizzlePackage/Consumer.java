package sausageSizzlePackage;

public class Consumer implements Runnable {
	SausageStand stand;

	public Consumer(SausageStand s) {
		stand = s;
	}

	@Override
	public void run() {
		System.out.println("Customer Thread name trying to buy a sausage" + Thread.currentThread().getName() );
		SausageStand.buySausage();
		
	}

}
