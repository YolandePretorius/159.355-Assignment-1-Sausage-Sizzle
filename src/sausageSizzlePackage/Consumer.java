package sausageSizzlePackage;

import java.util.Random;

public class Consumer implements Runnable {
	SausageStand stand;
	

	public Consumer(SausageStand s) {
		stand = s;
	}

	@Override
	public void run() {
		Random randomNumber = new Random();
		int x =randomNumber.nextInt(3-1+1) + 1;
		System.out.println("CLIENT: " +Thread.currentThread().getName());
		System.out.println("Total number of sausages "+Thread.currentThread().getName()+" wants to buy: " + x);
		for (int i = 1; i <= x; i++) {
			
			System.out.println(Thread.currentThread().getName()+" has already bought: "+i+" number of sausages");
			try {
				SausageStand.buySausage(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
