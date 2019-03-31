package cn.tju.scs.c02.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

public class SystemDemo {

	public static void main(String[] args) throws Exception {
//		try{
//			Integer.parseInt("abc");
//		} catch(Exception e){
//			
//			
//			System.err.println(e);
//			System.out.println("-----------------");
//			System.out.println(e);
//		}
		
		OutputStream out = System.out;
		out.write("Tianjin Unviersity".getBytes()); //屏幕输出
		
//		Consumer<String> con = System.out::println;
//		con.accept("fadfa");

	}

}
