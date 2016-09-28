package com.concurrency.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ThreeThreadSequenceUsingCondition {

	public static void main(String[] args) {
            Shared shared = new Shared();
            Lock lock = new ReentrantLock();
            Condition con = lock.newCondition();
            
            Thread A = new Thread(new PrintA(shared,lock,con),"Thread-A");
            Thread B = new Thread(new PrintB(shared,lock,con),"Thread-B");
            Thread C = new Thread(new PrintC(shared,lock,con),"Thread-C");
            A.start();
            B.start();
            C.start();
	}

}

class Shared{
	private String nextStr = "a";

	public String getNextStr() {
		return nextStr;
	}

	public void setNextStr(String nextStr) {
		this.nextStr = nextStr;
	}
}




class PrintA implements Runnable{
	private Shared shared;
	private Lock lock;
	private Condition condition;
	
	public PrintA(Shared shared, Lock lock, Condition con){
		this.shared = shared;
		this.condition = con;
	    this.lock = lock;
	}
	public void run(){
		int count = 0;
		try {
		while(count < 10){
			lock.lock();
			if(shared.getNextStr().equals("a"))
			{
				System.out.println();
				System.out.print("a");
				count++;
				shared.setNextStr("b");
				condition.signalAll();
			}else{
				condition.await();	
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}	

class PrintB implements Runnable{
	private Shared shared;
	private Lock lock;
	private Condition condition;
	
	public PrintB(Shared shared, Lock lock, Condition con){
		this.shared = shared;
		this.condition = con;
	    this.lock = lock;
	}
	public void run(){
		int count = 0;
		try {
	    while(count < 10){
			lock.lock();
			if(shared.getNextStr().equals("b"))
			{
				System.out.print("b");
				count++;
				shared.setNextStr("c");
				condition.signalAll();
			}else{
				condition.await();
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}


class PrintC implements Runnable{
	private Shared shared;
	private Lock lock;
	private Condition condition;
	
	public PrintC(Shared shared, Lock lock, Condition con){
		this.shared = shared;
		this.condition = con;
	    this.lock = lock;
	}
	public void run(){
		int count = 0;
		try {
		  while(count < 10){
			lock.lock();
			if(shared.getNextStr().equals("c"))
			{
				System.out.print("c");
				count ++;
				shared.setNextStr("a");
				condition.signalAll();
			}else{
				condition.await();	
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}


