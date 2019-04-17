package cn.tju.scs.c04.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 100                                                                                                                                                                                                                                                                                                                                                                                                                                 ; i++) {
			threadPool.execute(new Runnable(){
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		
		threadPool.shutdown();
		
	}

}
