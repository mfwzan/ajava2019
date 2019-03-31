package cn.tju.scs.c03.jvm;

public class ClassLoaderFirstDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		System.out.println(clazz.getClassLoader());
		Class clazz2 = Class.forName("cn.tju.scs.c03.jvm.User");
		System.out.println(clazz2.getClassLoader());
	}

}
