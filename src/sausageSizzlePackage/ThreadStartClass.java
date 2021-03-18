package sausageSizzlePackage;

public class ThreadStartClass {
	
	static int MaxSausagesPerClient = 3;
	
	

	public static void main(String[] args) throws InterruptedException {
		
		SausageStand Stand = new SausageStand(MaxSausagesPerClient);
		
		System.out.println("  ");
		System.out.println("################# Welcome to our sausage sizzle sale ###########################");
		System.out.println("  ");
		
		
		Barbeque producer1 = new Barbeque(Stand);
		Barbeque producer2 = new Barbeque(Stand);
		Consumer customer1 = new Consumer(Stand);
		
		Thread Barbeque1Thread = new Thread(producer1,"Barbeque 1");
		Thread Barbeque2Thread = new Thread(producer2,"Barbeque 2");
		
		Barbeque1Thread.start();
		Barbeque2Thread.start();
		
		for (int i = 1; i <= 5; i++) {
			Thread Customer1Thread = new Thread(customer1,"Customer# "+i);
			Customer1Thread.start();
		}
		
		Thread.sleep(2000);
		producer1.setStop(true);
		producer2.setStop(true);
		
		//Thread Customer1Thread = new Thread(customer1,"Customer 1");
		
		//System.out.println("Starting our Barbeque thread 1 " + Barbeque1Thread.getName());
		
		
		//Customer1Thread.start();
	}

}
