package cn.tju.scs.c04.thread;

class Singleton {
	private Singleton() {}
	
	private static Singleton instance=new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}

}

public class SingletonDemo{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3);
		Singleton s4 = Singleton.getInstance();
		System.out.println(s4);
	}
}
