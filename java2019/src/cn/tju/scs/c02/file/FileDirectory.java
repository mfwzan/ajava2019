package cn.tju.scs.c02.file;

import java.io.File;
import java.io.IOException;

public class FileDirectory {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/demo2");
		File file2 = new File(file,"def/directory.txt");
		
		System.out.println(file2.createNewFile());

	}

}
