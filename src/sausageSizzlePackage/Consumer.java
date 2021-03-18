

package sausageSizzlePackage;

import java.util.NoSuchElementException;
import java.util.Random;

public class Consumer implements Runnable {
	SausageStand stand;
	

	public Consumer(SausageStand s) {
		stand = s;
	}

	@Override
	public void run() {
		Random randomNumber = new Random();
		int x =randomNumber.nextInt(3-1+1) + 1;// randomly assign the amount of sausages customer will buy between 1 and 3 
		
		System.out.println("Total number of sausages "+Thread.currentThread().getName()+" wants to buy: " + x);
		for (int i = 1; i <= x; i++) { // loop through the random amount of sausages customer will buy
			try {
				Thread.sleep(500);  // wait for sausages to be produced
			} catch (InterruptedException e) {}
			try {
			SausageStand.buySausage(i);
			}catch(NoSuchElementException e) {
				i--;  // if there is no sausages available for the client to buy, the thread runs an extra time to check for sausages
			}
		
		}
	}

}
