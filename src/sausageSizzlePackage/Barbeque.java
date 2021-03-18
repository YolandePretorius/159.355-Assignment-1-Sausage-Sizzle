// class produces sausages 

package sausageSizzlePackage;

	

public class Barbeque implements Runnable {
	
	 SausageStand stand;
	 int i =0;
	 
	public Barbeque(SausageStand s) {
		stand = s;
		
	}
	
	@Override
	public void run() {
		
		
		while (!Thread.currentThread().isInterrupted()) { // while the thread is not interupted, sausages are produced
			i++;
			SausageStand.ProduceSausage(i);
			System.out.println(" ");
			
			try {
				Thread.sleep(100);		// sleep so that enough time is set between sausages produced and customers buying sausages
			} catch (InterruptedException e) {
				return;  //if thread is interupted it returns and stops thread
			}
		}
		
	}


}
