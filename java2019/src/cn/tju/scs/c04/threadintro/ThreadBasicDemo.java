package cn.tju.scs.c04.threadintro;


class MyThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}
}

public class ThreadBasicDemo {

	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2();	
		mt1.setName("t1");
		MyThread2 mt2 = new MyThread2();		
		mt1.start();
		mt2.run();
	}

}