package cn.tju.scs.c04.threadstate;

class MyThreadTimedWaiting extends Thread{
	@Override
	public void run() {
		
		try {
			System.out.println("Begin sleep");
			Thread.sleep(10000);
			System.out.println("End Sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class RunTimedWaiting {
	public static void main(String[] args) {
		
		try {
			MyThreadTimedWaiting t = new MyThreadTimedWaiting();
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的状态" + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}


