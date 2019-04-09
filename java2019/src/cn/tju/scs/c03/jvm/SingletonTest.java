package cn.tju.scs.c03.jvm;

public class SingletonTest {
     public static int counter1;     
     public static int counter2 = 0;
     private static SingletonTest singleton = new SingletonTest();
     public static int counter3 = 0;
     public static int counter4;
     
	 private SingletonTest()	 {
		 counter1++;
		 counter2++;
		 counter3++;
		 counter4++;
	 }
	 
	 public static SingletonTest getInstance()	 {
		 return singleton;
		 }
}
