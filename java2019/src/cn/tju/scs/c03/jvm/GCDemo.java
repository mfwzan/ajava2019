package cn.tju.scs.c03.jvm;

public class GCDemo {
	public static void main(String[] args) {
		{
			byte[] buff = new byte[600*1024*1024];
		}
		
		int a = 10;
		System.gc();
	}

}
