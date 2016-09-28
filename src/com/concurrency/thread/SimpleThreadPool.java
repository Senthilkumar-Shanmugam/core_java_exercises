package com.concurrency.thread;

import java.util.LinkedList;
import java.util.List;

public class SimpleThreadPool {
	
	private WorkerThread[] threads;
	private List<Task> taskQueue;
	private boolean isShutdownInitiated;
	
	public SimpleThreadPool(int threadNum){
		taskQueue = new LinkedList<Task>();
		threads = new WorkerThread[threadNum];
		
		for(int i=0;i<threadNum;i++){
			threads[i] = new WorkerThread();
			threads[i].start();
		}
	}
	
     public void enqueque(Task task){
		synchronized (taskQueue) {
			taskQueue.add(task);
			taskQueue.notifyAll();
		}
	}
     
     public void  shutdownPool(){
    	 this.isShutdownInitiated = true;
     }
	
	public class WorkerThread extends Thread{
		
		WorkerThread(){}
			
		public void run(){
			Runnable r;
			
			while(true){
				synchronized (taskQueue) {
					while(taskQueue.isEmpty()){
						try {
							taskQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					r = taskQueue.remove(0);
	
			}
				try {
					r.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public class Task extends Thread{
		
		Task(){}
		
		
		public void run(){}
	}

}
