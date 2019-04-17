package cn.tju.scs.c04.threadstate;

public class BlockedState {
	   public static void main(String[] args) {
	       final BlockedState mainTest = new BlockedState();
	       new Thread(new Runnable() {
	           @Override
	           public void run() {
	               mainTest.m1();
	           }
	       }, "thread-m1").start();

	       new Thread(new Runnable() {
	           @Override
	           public void run() {
	               mainTest.m2();
	           }
	       }, "thread-m2").start();
	   }

	   public synchronized void m1() {
	       System.out.println("m1");
	       while (true) ;
	   }

	   public synchronized void m2() {
	       System.out.println("m2");
	       while (true) ;
	   }
	}
