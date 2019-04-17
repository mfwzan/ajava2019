package cn.tju.scs.c04.synchronization;

public class VolatileFlag {
	public volatile boolean flag = false;
	
	public static void main(String[] args) {
		VolatileFlag f = new VolatileFlag();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					System.out.println("执行了第" + i + "次");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				f.flag = true;				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!f.flag) {
					
				}
				System.out.println("线程2执行了。。。");
			}
		}).start();
	}

}
