package sausageSizzlePackage;

public class ThreadStartClass {
	
	static int MaxSausagesPerClient = 3;
	
	

	public static void main(String[] args) {
		
		SausageStand Stand = new SausageStand(MaxSausagesPerClient);
		System.out.println("Welcome to our sausage sizzle sale");
		
		Barbeque producer1 = new Barbeque(Stand);
		
		Thread Barbeque1Thread = new Thread(producer1,"Barbeque 1");
		
		System.out.println("Starting our Barbeque thread 1 " + Barbeque1Thread.getName());
		
		Barbeque1Thread.start();

	}

}
