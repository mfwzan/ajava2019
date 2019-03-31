package cn.tju.scs.c02.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException  {
		File file = new File("d:" + File.separator+ "demo" + File.separator +"demochild" + File.separator + "test.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		System.out.println(file.createNewFile());
		
		
//		File file = new File("e:" + File.separator + "demo2"+File.separator+"scs2017.txt");
//		
//		if (!file.getParentFile().exists()) {
//			file.getParentFile().mkdir();
//		}
//		if (file.exists()){
//			file.delete();
//		}else{
//			System.out.println(file.createNewFile());
//		}
	}

}
