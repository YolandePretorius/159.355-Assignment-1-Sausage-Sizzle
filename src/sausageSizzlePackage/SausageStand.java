package sausageSizzlePackage;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SausageStand {
	
	static LinkedList<Integer> NumberSausagesProduced = new LinkedList<Integer>();
	int maxSausagesPerClient;
	

	public SausageStand(int maxSausagesPerClient) {
		this.maxSausagesPerClient = maxSausagesPerClient;
		
	}

	public static synchronized  void ProduceSausage(int i) {
		try {
			NumberSausagesProduced.add(i);
			System.out.println(Thread.currentThread().getName() + " has another sausage ready. Total sausages available is "+ NumberSausagesProduced.size());
			System.out.println("===================================");
			System.out.println(" ");
		}catch(NoSuchElementException e){
			
		}
	}

	
	public static synchronized  void buySausage(int i) throws InterruptedException {
		try {
			NumberSausagesProduced.remove();
			System.out.println("There is: "+NumberSausagesProduced.size()+" sausages left after  "+ Thread.currentThread().getName()+ " have bought "+i+" sausage");
			System.out.println("-------------------------------------------");
			System.out.println(" ");
			Thread.sleep(200);
		}catch(NoSuchElementException e){
			
		}
	}
	
	

}

