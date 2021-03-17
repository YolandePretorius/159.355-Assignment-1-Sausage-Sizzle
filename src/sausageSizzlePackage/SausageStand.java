package sausageSizzlePackage;

public class SausageStand {
	int maxSausagesPerClient;
	static int NumberSausagesProduced;

	public SausageStand(int maxSausagesPerClient) {
		this.maxSausagesPerClient = maxSausagesPerClient;
		NumberSausagesProduced = 0;
	}

	public static void ProduceSausage() {
		NumberSausagesProduced +=1;
		System.out.println("Number sausages produced : "+ NumberSausagesProduced + "  by BBQ name "+Thread.currentThread().getName());
	}

}
