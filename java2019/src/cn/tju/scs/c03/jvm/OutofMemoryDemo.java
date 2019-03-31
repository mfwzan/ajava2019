package cn.tju.scs.c03.jvm;

import java.util.ArrayList;
import java.util.List;

public class OutofMemoryDemo {

//	public static void main(String args[]){
//	    ArrayList<byte[]> list=new ArrayList<byte[]>();
//		    for(int i=0;i<1024;i++){
//		        list.add(new byte[1024*1024]);
//		    }
//	}
	
	public static void main(String[] args) {
		List<TestCase> demolist = new ArrayList<TestCase>();
		while(true) {
			demolist.add(new TestCase());
		}
	}

}
