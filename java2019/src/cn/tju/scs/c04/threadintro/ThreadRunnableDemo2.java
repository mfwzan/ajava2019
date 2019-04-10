package cn.tju.scs.c04.threadintro;

class MyThreadRun2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}
}

public class ThreadRunnableDemo2 {

	public static void main(String[] args) {
		MyThreadRun2 mtr = new MyThreadRun2();
		Thread t = new Thread(mtr);
		t.start();
	}

}
