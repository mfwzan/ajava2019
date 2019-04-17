package cn.tju.scs.c04.thread;

public class SignalDemo {
	private volatile int signal = 0;
	
	public void set(int signal) {
		this.signal = signal;
	}
	
	public int get() {
		return this.signal;
	}
	
	public static void main(String[] args) {
		SignalDemo d = new SignalDemo();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("修改状态的线程执行...");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				d.set(1);
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//等待Signal为1开始执行，否则不能执行
				while(d.get() != 1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//当信号为1的时候，执行代码
				System.out.println("模拟代码的执行...");
			}
		}).start();
	}

}
