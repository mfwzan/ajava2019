package cn.tju.scs.c04.threadstate;

public class WaitingState {
	   public static void main(String[] args) {
	       final WaitingState mainTest = new WaitingState();
	       new Thread(new Runnable() {
	           @Override
	           public void run() {
	               mainTest.m1();
	           }
	       }, "thread-m1").start();
	   }

	   public synchronized void m1() {
	       System.out.println("m1---start");
	       try {
	           this.wait();
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	       System.out.println("m1---end");
	   }
	}
	