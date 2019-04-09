package cn.tju.scs.c04.threadintro;

public class StopDemo {
	public static void main(String[] args) {
		RunnerStop rs = new RunnerStop();
		Thread t = new Thread(rs);
		t.start();
		for (int i = 0; i < 100000; i++) {
			if(i%10000==0 & i>0) {
				System.out.println("in thread main i = " + i);
			}
		}
		
		System.out.println("Thread main is over");
		rs.shutdown();
	}

}

class RunnerStop implements Runnable{
	private boolean flag = true;

	@Override
	public void run() {
		int i = 0;
		while(flag == true) {
			System.out.println(" " + i++);
		}		
	}
	
	public void shutdown() {
		flag = false;
	}
	
}
