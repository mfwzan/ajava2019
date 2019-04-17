package cn.tju.scs.c04.threadstate;

public class WaitingState2 {
	   public static void main(String[] args) throws InterruptedException {
	       Thread t = new Thread(new Runnable() {
	           @Override
	           public void run() {
	               while (true) ;
	           }
	       });
	       t.start();
	       t.join();//等待t线程结束后再往下执行
	       System.out.println("main---end");
	   }
	}
	