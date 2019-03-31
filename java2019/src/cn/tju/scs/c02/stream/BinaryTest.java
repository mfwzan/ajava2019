package cn.tju.scs.c02.stream;

public class BinaryTest {
	public static void main(String[] args) {
		byte[] a = new byte[8] ;
		for (int i = 0; i < a.length; i++) {
			a[i]=1;
		}
		
		System.out.println(new String(a));
	}

}
