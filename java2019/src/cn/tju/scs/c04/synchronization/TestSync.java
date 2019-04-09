package cn.tju.scs.c04.synchronization;


class Timer{
	private static int num = 0;
	public  void add(String name) {
		num++;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + ",你是第"+num+"个使用timer的线程");
		
	}
}
public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args) {		
		TestSync test = new TestSync();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		timer.add(Thread.currentThread().getName());
	}

}
