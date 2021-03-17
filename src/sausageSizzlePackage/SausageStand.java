package sausageSizzlePackage;

import java.util.LinkedList;

public class SausageStand {
	
	static LinkedList<Integer> NumberSausagesProduced = new LinkedList<Integer>();
	int maxSausagesPerClient;
	

	public SausageStand(int maxSausagesPerClient) {
		this.maxSausagesPerClient = maxSausagesPerClient;
		
	}

	public static synchronized  void ProduceSausage(int i) {
		NumberSausagesProduced.add(i);
		System.out.println(Thread.currentThread().getName() + " has another sausage ready. Total sausages left is "+ NumberSausagesProduced.size());
		System.out.println("===================================");
		System.out.println(" ");
	}

	
	public static synchronized  void buySausage(int i) throws InterruptedException {
		
		NumberSausagesProduced.remove();
		System.out.println("There is: "+NumberSausagesProduced.size()+" amount of sausages left after  "+ Thread.currentThread().getName()+ " have bought "+i+" sausage");
		System.out.println("-------------------------------------------");
		System.out.println(" ");
		Thread.sleep(200);
	}
	
	

}

