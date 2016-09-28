package com.concurrency.thread;


class OddNumThread extends Thread{
	private Object objLock;
	private int num=1;
	
	OddNumThread(Object monitor){
		this.objLock = monitor;
	}
	
	public void run(){
		synchronized (objLock) {
			while(num<=10){
				System.out.println("Odd Thread>>"+num);
			num +=2;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		}
	}
}
class EvenNumThread extends Thread{
	private Object objLock;
	private int num;
	
	EvenNumThread(Object monitor){
		this.objLock = monitor;
	}
	
	public void run(){
		synchronized (objLock) {
			while(num<=10){
			num +=2;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Even Thread>>"+num);
			
		}
		}
}
}
public class EvenOddThreadTest {
	public static void main(String[] args) {
		Object monitor = new Object();
		new OddNumThread(monitor).start();
		new EvenNumThread(monitor).start();
		
  }
}
