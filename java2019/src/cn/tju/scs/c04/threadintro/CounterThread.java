package cn.tju.scs.c04.threadintro;

public class CounterThread extends Thread{
	private static int counter = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this);
//			synchronized (this) {
				counter++;
//			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		int num = 10;
		Thread[] threads = new Thread[num];
		for (int i = 0; i < num; i++) {
			threads[i] = new CounterThread();
			threads[i].setName("线程" + i);
			threads[i].start();					
		}
		
		for (int i = 0; i < num; i++) {
			threads[i].join();
		}
		
		System.out.println(counter);
		
	}
}
