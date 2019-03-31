package cn.tju.scs.c02.stream;

import java.util.Scanner;

public class ScannerDemo {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入数值：");
//		if (scan.hasNextDouble()){
//			System.out.println("输入的数据：" + scan.nextDouble());
//		} else {
//			System.out.println("输入的不是数据");
//		}
//		scan.close();
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生日：");
		if (scan.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			String bir = scan.next("\\d{4}-\\d{2}-\\d{2}");
			System.out.println("输入内容：" + bir);
		} else {
			System.out.println("生日格式错误！");
		}
		
		scan.close();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
