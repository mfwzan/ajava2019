package cn.tju.scs.c03.jvm;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = "abc";		
		
		System.out.println( str1 == str2);		
		
		String str3 = "ab" + "c";
		System.out.println(str2 == str3);
		
		String strintern = str1.intern();
		System.out.println(strintern == str2);
				
				
		String str5 = new String("abcd");
		String str6 = "ab"+"cd";
		String str7 = new String("ab") + new String("cd");
		System.out.println(str5 == str6);
		System.out.println(str5 == str7);	
	}

}
