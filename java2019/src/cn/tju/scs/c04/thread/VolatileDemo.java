package cn.tju.scs.c04.thread;

public class VolatileDemo {
    private static  boolean isOver = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
            	int i = 0;
                while (!isOver);
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isOver = true;
    }
}


