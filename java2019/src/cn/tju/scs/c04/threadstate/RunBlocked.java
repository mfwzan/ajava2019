package cn.tju.scs.c04.threadstate;

class MyThreadBlocked extends Thread{
	
	@Override
	public void run() {
		MyService.serviceMethod();
	}

}

class MyThreadBlocked2 extends Thread{
	
	@Override
	public void run() {
		MyService.serviceMethod();
	}

}

public class RunBlocked {
	public static void main(String[] args) {
//			try {
				MyThreadBlocked t1 = new MyThreadBlocked();
				t1.setName("t1");			
				t1.start();
//				Thread.sleep(1000);
				MyThreadBlocked2 t2 = new MyThreadBlocked2();
				t2.setName("t2");			
				t2.start();
				
				System.out.println("Main方法中的t2状态：" + t2.getName()+"-" + t2.getState());
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
			
		
		
		
	}

}
