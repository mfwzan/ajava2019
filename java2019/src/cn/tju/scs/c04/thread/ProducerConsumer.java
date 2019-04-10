package cn.tju.scs.c04.thread;

public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		ProducerNew pn = new ProducerNew(ss);
		Thread tProducer = new Thread(pn);
		tProducer.start();
		ConsumerNew cn = new ConsumerNew(ss);
		Thread tConsumer = new Thread(cn);
		tConsumer.start();
		
	}

}

class Mantou{
	int id;
	public Mantou(int id) {
		this.id = id;
	}
	public String toString() {
		return "Mantou:" + id;
	}
}

class SyncStack{
	int index = 0;
	Mantou[] arrMT = new Mantou[6];
	
	public synchronized void push(Mantou mt)  {
		while (index == arrMT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		this.notify();
		arrMT[index] = mt;
		index++;
	}
	
	public synchronized Mantou pop() throws InterruptedException {
		while (index == 0) {
			this.wait();
		}
		this.notify();
		index--;
		return arrMT[index];
	}
}

class ProducerNew implements Runnable{
	SyncStack ss = null;
	public ProducerNew(SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			Mantou mt = new Mantou(i);
			ss.push(mt);
			System.out.println("生产了：" + mt);
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class ConsumerNew implements Runnable{
	SyncStack ss = null;
	public ConsumerNew(SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			Mantou mt;
			try {
				mt = ss.pop();
				System.out.println("消费了：" + mt);
				Thread.sleep((long) (Math.random()*1000));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}