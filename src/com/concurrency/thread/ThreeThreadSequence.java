package com.concurrency.thread;

class ThreadOne implements Runnable{
	private Mutex mutex = null;
 
	public ThreadOne(Mutex ob){
		mutex = ob;
	}

	@Override
	public void run() {
	 synchronized(mutex){
			int count = 0;
		 while(count<10){
			 try {
			if(mutex.getNext().equals("a")){
 				 System.out.println();
				 System.out.print("a");
				 count++;
				 mutex.setNext("b");
				 mutex.notifyAll();
			}else
				mutex.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
	}
}
class ThreadTwo implements Runnable{
	private Mutex mutex = null;
	
	public ThreadTwo(Mutex ob){
		mutex = ob;
	}

	@Override
	public void run() {
	 synchronized(mutex){
			int count = 0;
		 while(count<10){
			 try {
			if(mutex.getNext().equals("b")){
				 System.out.print("b");
				 count++;
				 mutex.setNext("c");
				 mutex.notifyAll();
			}else
				mutex.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
	}
}

class ThreadThree implements Runnable{
	private Mutex mutex = null;

	
	public ThreadThree(Mutex ob){
		mutex = ob;
	}

	@Override
	public void run() {
	 synchronized(mutex){
			int count = 0;
		 while(count<10){
			 try {
			if(mutex.getNext().equals("c")){
				 System.out.print("c");
				 count++;
				 mutex.setNext("a");
				 mutex.notifyAll();
			}else
				mutex.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
	}
}
class Mutex{
	private String next="a";

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}
}
public class ThreeThreadSequence {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
          Thread A = new Thread(new ThreadOne(mutex));
          Thread B = new Thread(new ThreadTwo(mutex));
          Thread C = new Thread(new ThreadThree(mutex));
          A.start();
          B.start();
          C.start();
	}

}
