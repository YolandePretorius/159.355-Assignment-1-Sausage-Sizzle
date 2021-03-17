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
		System.out.println("BBQ name "+Thread.currentThread().getName() + " has another sausage ready. Total sausages left is "+ NumberSausagesProduced.size());
		
	}

	public static synchronized  void buySausage() {
		
		NumberSausagesProduced.remove();
		System.out.println("There is: "+NumberSausagesProduced.size()+" amount of sausages left after  "+ Thread.currentThread().getName()+ " have bought a sausage");
	}
	
	

}

