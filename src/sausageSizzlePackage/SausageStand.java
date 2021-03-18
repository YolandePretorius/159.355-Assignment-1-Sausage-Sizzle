package sausageSizzlePackage;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SausageStand {
	
	static LinkedList<Integer> NumberSausagesProduced = new LinkedList<Integer>(); // add and remove sausages to a list synchronized
	int maxSausagesPerClient;
	

	public SausageStand(int maxSausagesPerClient) {
		this.maxSausagesPerClient = maxSausagesPerClient; // determines the maximum amount of sausages customer are allowed to buy in this case 3
		
	}
	// add sausages to NumberSausagesProduced list 
	public static synchronized  void ProduceSausage(int i)  {

		try {
			NumberSausagesProduced.add(i);
			System.out.println(Thread.currentThread().getName() + " has another sausage ready. Total sausages available is "+ NumberSausagesProduced.size());
			System.out.println("===================================");
			System.out.println(" ");
		}catch(NoSuchElementException e){
			
		}
	}

	// remove sausages from NumberSausagesProduced list
	public static synchronized  void buySausage(int i) {
	
			NumberSausagesProduced.remove();
			System.out.println("There is: "+NumberSausagesProduced.size()+" sausages left after  "+ Thread.currentThread().getName()+ " have bought sausage nr: "+i);
			System.out.println("-------------------------------------------");
			System.out.println(" ");
			
			
		
		}
	
	

}

