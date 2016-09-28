package com.concurrency.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class LockAndConditionExample {
	public String printNext ="a";
	public static void main(String[] args) {
		LockAndConditionExample shared = new LockAndConditionExample();
		Lock lock = new ReentrantLock();
		Condition conA = lock.newCondition();
		Condition conB = lock.newCondition();
		Condition conC = lock.newCondition();
		
		Thread tA = new Thread(new AThread(shared,lock,conA,conB,conC),"Thread-A");
		Thread tB = new Thread(new BThread(shared,lock,conA,conB,conC),"Thread-B");
		Thread tC = new Thread(new CThread(shared,lock,conA,conB,conC),"Thread-C");
		
		tA.start();
		tB.start();
		tC.start();
		
	}

}

class AThread implements Runnable{
	private LockAndConditionExample shared;
	private Lock lock;
	private Condition conA, conB,conC;

	public AThread(LockAndConditionExample shared, Lock lock, Condition conA,Condition conB,Condition conC){
		this.shared = shared;
		this.lock = lock;
		this.conA = conA;
		this.conB = conB;
		this.conC = conC;
	}
	@Override
	public void run() {
	  lock.lock();
	  try{
         for(int i=0;i<10;i++){		  
		  while(!shared.printNext.equals("a"))
			  conA.await();
		  
		  System.out.println();
		  System.out.print("a");
		  shared.printNext = "b";
		  conB.signal();
         } 
	  } catch (InterruptedException e) {
		e.printStackTrace();
	}finally{
		  lock.unlock();
	  }
		
	}
	
}

class BThread implements Runnable{
	private LockAndConditionExample shared;
	private Lock lock;
	private Condition conA, conB,conC;
	
    public BThread(LockAndConditionExample shared, Lock lock, Condition conA,Condition conB,Condition conC){
    	this.shared = shared;
    	this.lock = lock;
		this.conA = conA;
		this.conB = conB;
		this.conC = conC;
	}

	@Override
	public void run() {
		  lock.lock();
		  try{
			  for(int i=0;i<10;i++){
			  while(!shared.printNext.equals("b"))
				  conB.await();
			  
			  
			  System.out.print("b");
			  shared.printNext="c";
			  conC.signal();
			  }
		  } catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			  lock.unlock();
		  }
	}
}
class CThread implements Runnable{
		private LockAndConditionExample shared;
		private Lock lock;
		private Condition conA, conB,conC;
		
	    public CThread(LockAndConditionExample shared, Lock lock, Condition conA,Condition conB,Condition conC){
	    	this.shared = shared;
	    	this.lock = lock;
			this.conA = conA;
			this.conB = conB;
			this.conC = conC;
		}

		@Override
		public void run() {
			  lock.lock();
			  try{
				  for(int i=0;i<10;i++){
				  while(!shared.printNext.equals("c"))
					  conC.await();
				  
				  
				  System.out.print("c");
				  shared.printNext="a";
				  conA.signal();
				  }
			  } catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				  lock.unlock();
			  }

		}
	
}


