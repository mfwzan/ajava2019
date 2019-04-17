package cn.tju.scs.c04.synchronization;

public class VolatileDemo {
	private volatile int a = 1;
	public  int getA() {
		return a;
	}
	
	public  void setA(int a) {
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		this.a = a;
	}
	
	public static void main(String[] args) {
		VolatileDemo demo = new VolatileDemo();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.setA(10);
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println(demo.getA());
			}
		}).start();
	}

}
