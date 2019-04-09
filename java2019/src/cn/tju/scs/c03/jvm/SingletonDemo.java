package cn.tju.scs.c03.jvm;

class Singleton {
    public static int counter1;     
    public static int counter2 = 0;
    private static Singleton singleton = new Singleton();
    public static int counter3 = 0;
    public static int counter4;    
	 private Singleton()	 {
		 counter1++;
		 counter2++;
		 counter3++;
		 counter4++;
	 }	 
	 public static Singleton getInstance()	 {
		 return singleton;
		 }
}
public class SingletonDemo {

	public static void main(String[] args) {
		SingletonTest singleton = SingletonTest.getInstance();
		System.out.println(singleton.counter1); //1
		System.out.println(singleton.counter2);	//1
		System.out.println(singleton.counter3);	//0
		System.out.println(singleton.counter4);	//1
	}

}
