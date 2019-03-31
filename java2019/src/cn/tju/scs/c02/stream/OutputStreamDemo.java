package cn.tju.scs.c02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1. 定义一个file对象
		File file = new File("E:" + File.separator + "demo2019" + 
				File.separator + "testoutput.txt");
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		//2. 根据file对象定义一个OutputStream对象
		OutputStream os = new FileOutputStream(file,true);
		String str = "Good good study, day day up \r\n";
		String strcn = "好好学习，天天向上！";
		byte data[] = str.getBytes(); //将字符串变为字节数组，将字符数组转为字符串？
		byte datacn[] = strcn.getBytes();
 		
		//3. 循环写入os
//		for(int x = 0; x<data.length; x++){
//			os.write(data[x]);
//		}
//		os.write(datacn);
		os.write(datacn, 5, 6);
		os.close();
	}

}
