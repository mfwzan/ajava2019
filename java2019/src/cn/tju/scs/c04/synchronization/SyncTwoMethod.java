package cn.tju.scs.c04.synchronization;

public class SyncTwoMethod implements Runnable{
	int a = 100;
	
	public  void m1() throws InterruptedException {
		a = 1000;
		Thread.sleep(4000);
		System.out.println("a = " + a);
	}
	
	public void m2() throws InterruptedException {
		a = 2000;
		Thread.sleep(2000);
		
		System.out.println(a);
	}
	
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod stm = new SyncTwoMethod(); 
		Thread t = new Thread(stm);
		t.start();
		stm.m2();
	}

	@Override
	public void run() {
		try {
			m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
