package cn.tju.scs.c04.threadintro;

public class TestThread {

	public static void main(String[] args) {
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
//		t.run();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread-----" + i);
		}

	}

}

class Runner1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1:" + i);
		}
	}
	
}
