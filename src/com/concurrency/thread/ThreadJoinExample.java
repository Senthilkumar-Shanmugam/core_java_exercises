package com.concurrency.thread;

public class ThreadJoinExample {

	
	
    public static void main(String[] args) {
    	System.out.println("main thread start");
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        t1.start();
        t2.start();
       t3.start();
        
        //let all threads finish execution before finishing main thread
        try {
            t1.join();
         
          
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main thread ends");
    }
}
class MyRunnable implements Runnable{
	 
    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
     
}