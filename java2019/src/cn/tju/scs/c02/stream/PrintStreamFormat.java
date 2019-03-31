package cn.tju.scs.c02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamFormat {

	public static void main(String[] args) throws Exception {
		String name = "John";
		int age = 20;
		double score = 59.4355;
		PrintStream ps = new PrintStream(new FileOutputStream(("e:" + File.separator + "demo2019"+
				File.separator+"printstream.txt")));
		ps.printf("姓名：%s，年龄：%d，成绩：%5.2f", name,age,score);
		
		String str = String.format("姓名：%s，年龄：%d，成绩：%5.2f", name,age,score);
		System.out.println(str);

	}

}
