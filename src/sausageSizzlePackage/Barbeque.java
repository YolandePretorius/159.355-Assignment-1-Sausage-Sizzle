package sausageSizzlePackage;

	

public class Barbeque implements Runnable {
	
	 SausageStand stand;
	 private Boolean stop = false;
	 int i =0;
	 
	public Barbeque(SausageStand s) {
		stand = s;
		
	}
	
	
	public void run() {
		
		
		while(i<30) {
			i++;
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

	public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }       
	

}
