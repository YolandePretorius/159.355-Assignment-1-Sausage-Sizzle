package sausageSizzlePackage;

import java.util.ArrayList;
import java.util.Iterator;



public class ThreadStartClass {
	
	static int MaxSausagesPerClient = 3;
	
	

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		SausageStand Stand = new SausageStand(MaxSausagesPerClient);
		
		System.out.println("  ");
		System.out.println("################# Welcome to our sausage sizzle sale ###########################");
		System.out.println("  ");
		
		
		Barbeque producer1 = new Barbeque(Stand);
		Barbeque producer2 = new Barbeque(Stand);
		Consumer customer1 = new Consumer(Stand);
		
		Thread Barbeque1Thread = new Thread(producer1,"Barbeque 1");
		Thread Barbeque2Thread = new Thread(producer2,"Barbeque 2");
		//Thread Customer1Thread = new Thread(customer1,"Customer# ");
		
		//Customer1Thread.start();
		Barbeque1Thread.start();
		Barbeque2Thread.start();
		
		
		// generate 100 threads which will be customers and add them to a list threads
		for (int i = 1; i <= 100; i++) {
			Thread Customer1Thread = new Thread(customer1,"Customer# "+i);
			threads.add(Customer1Thread);
			Customer1Thread.start();
		}
	// interupts the customer threads that is in the threads list and stops them
		for (Thread thread : threads) {
				thread.interrupt();
				thread.join();
		}
		

		Barbeque1Thread.interrupt();
		Barbeque2Thread.interrupt();
		
		Barbeque1Thread.join();
		Barbeque2Thread.join();
		
		System.out.println("Thank you for your support!!!!!!!!!!!");
		
	}

}
