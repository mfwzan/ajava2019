package cn.tju.scs.c04.threadintro;

class TicketRun implements Runnable{
	private static int ticket = 10;
	
	public static synchronized void printOne() {
		if (ticket > 0) {
			System.out.println("线程名：" + Thread.currentThread().getName() + " Ticket：" + ticket--);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			printOne();
		}		
	}	
}

public class TicketRunDemo {
	public static void main(String[] args) {
		TicketRun tr = new TicketRun();
		new Thread(tr,"一号窗口").start();
		new Thread(tr,"二号窗口").start();
		new Thread(tr,"三号窗口").start();

	}

}
