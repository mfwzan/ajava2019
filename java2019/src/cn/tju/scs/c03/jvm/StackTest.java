package cn.tju.scs.c03.jvm;

public class StackTest {
	private void test() {
		System.out.println("方法执行");
		test();
	}
	
	public static void main(String[] args) {
		new StackTest().test();
	}
	

}
