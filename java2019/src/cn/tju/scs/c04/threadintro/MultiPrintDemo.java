package cn.tju.scs.c04.threadintro;


class PrintChar implements Runnable{
	private String name;
	public PrintChar(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.print(this.name);
	}
}

public class MultiPrintDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread t1 = new Thread(new PrintChar("A"));
			t1.start();
			t1.join();
				
			Thread t2 = new Thread(new PrintChar("B"));
			t2.start();
			t2.join();
				
			Thread t3 = new Thread(new PrintChar("C"));
			t3.start();
			t3.join();				
		}
	}	
}
