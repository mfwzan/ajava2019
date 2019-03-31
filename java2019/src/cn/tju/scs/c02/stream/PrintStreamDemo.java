package cn.tju.scs.c02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintUtil{
	private OutputStream output;
	public PrintUtil(OutputStream output) {
		this.output = output;
	}
	
	public void print(int x){
		this.print(String.valueOf(x));
	}
	
	public void print(double x) {
		this.print(String.valueOf(x));
	}
	public void print(String x){
		try {
			output.write(x.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			this.output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(new File("e:" + File.separator + "demo2019"+
					File.separator+"printstream.txt")));
		ps.print("天津大学");
		ps.println("Tianjin University");
		ps.println(1+1);
		ps.println(1.1 + 1.1);
		ps.close();
		
//		PrintUtil pu = new PrintUtil(new FileOutputStream(new File("e:" + File.separator + "demo2019"+
//				File.separator+"printstream.txt")));
//		pu.print("天津大学\t\n");
//		pu.print("Tianjin University\t\n");
//		pu.print(1+1);
//		pu.print("\t\n");
//		pu.print(1.1 + 1.1);
//		pu.close();
//		

	}

}
