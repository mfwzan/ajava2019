package cn.tju.scs.c04.threadintro;

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("小明");
		JoinThread t2 = new JoinThread("小东");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}

class JoinThread extends Thread{
	public JoinThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " - " + i);
		}
	}
}
