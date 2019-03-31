package cn.tju.scs.c03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicClient {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.out.println(System.getProperties().get("sun.misc.ProxyGenerator.saveGeneratedFiles"));
		RealSubject realSubject = new RealSubject();
		InvocationHandler handler = new DynamicSubject(realSubject);
		Class<?> clazz = handler.getClass();
		 System.out.println("$Proxy0.class全名: "+Proxy.getProxyClass(clazz.getClassLoader(), realSubject.getClass().getInterfaces()));
		
		//下面的代码一次性生成代理
		Subject subject = (Subject)Proxy.newProxyInstance(clazz.getClassLoader(), 
				realSubject.getClass().getInterfaces(), handler);
		subject.request();
		subject.output();
		System.out.println(subject.getClass());
		

	}

}
