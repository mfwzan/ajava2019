package cn.tju.scs.c04.synchronization;

public class SequenceDemo {
	private static int value;
	public synchronized int getNext() {
		return value++;
	}
	
	public static synchronized int getPrevious() {
		return value--;
	} 
	
	public int xx() {
		synchronized(this) {
			if (value>0) {
				return value;
			}else {
				return 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		SequenceDemo s = new SequenceDemo();
//		while(true) {
//			System.out.println(s.getNext());
//		}
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}

}
