package cn.tju.scs.c04.threadstate;

class MyThread extends Thread{
	public MyThread() {
		System.out.println("构造方法中的状态：" + Thread.currentThread().getName()+"-"+Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		System.out.println("run方法中的状态：" + Thread.currentThread().getName() + "-"  +Thread.currentThread().getState());
	}

}

public class Run1 {
	public static void main(String[] args) {
		
		try {
			MyThread t = new MyThread();
			System.out.println("Main方法中的状态1：" + t.getName()+"-"+ t.getState());
			Thread.sleep(1000);
			
			t.start();
			Thread.sleep(1000);
			System.out.println("Main方法中的状态2：" + t.getName()+"-" + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
