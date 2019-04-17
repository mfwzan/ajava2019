package cn.tju.scs.c04.synchronization;


class Singleton{
	private static Singleton instance = null;
	private Singleton(){}
	
	
	public static Singleton getInstance(){

//		if (instance == null) {
//			if (instance == null){
//				instance = new Singleton();
//				}			
//		}
		
		if (instance == null) {
			synchronized(Singleton.class){
				if (instance == null){
					instance = new Singleton();
				}
			}
		}
		
		
		return instance;
	}
}

class SThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + Singleton.getInstance());
	}
}

public class SingletonDemo {

	//多线程下
	public static void main(String[] args) {
		SThread st = new SThread();

		for (int i = 0; i < 20; i++) {
			Thread t = new Thread(st);
			t.start();
		}

	}
	
	//单线程下
//	public static void main(String[] args) {
//		Singleton s1 = Singleton.getInstance();
//		System.out.println(s1);
//		Singleton s2 = Singleton.getInstance();
//		System.out.println(s2);
//		Singleton s3 = Singleton.getInstance();
//		System.out.println(s3);
//		Singleton s4 = Singleton.getInstance();
//		System.out.println(s4);
//	}

}
