package com.concurrency.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker implements Runnable {
    public boolean running = false;
	public Worker(){
	  Thread thread= new Thread(this);
	  thread.start();
	}
	
	@Override
	public void run() {
	    this.running = true;  
	    System.out.println("This is currently running on a separate thread, " +  
	        "the id is: " + Thread.currentThread().getId());  
	      
	    try   
	    {  
	      // this will pause this spawned thread for 5 seconds  
	      //  (5000 is the number of milliseconds to pause)  
	      // Also, the Thread.sleep() method throws an InterruptedException  
	      //  so we must "handle" this possible exception, that's why I've  
	      //  wrapped the sleep() method with a try/catch block  
	    	System.out.println(Thread.currentThread().getId()+"going sleep");
	      Thread.sleep(5000);  
	      System.out.println(Thread.currentThread().getId()+"is awake");
	    }   
	    catch (InterruptedException e)   
	    {  
	      Thread.currentThread().interrupt();  
	    }  
	    this.running = false;  
	  } 

	

	public static void main(String[] args) throws InterruptedException {
		  List<Worker> workers = new ArrayList<Worker>();  
	
		  
	      
		    System.out.println("This is currently running on the main thread, " +  
		        "the id is: " + Thread.currentThread().getId());  
		  
		    Date start = new Date();  
		  
		    // start 5 workers  
		    for (int i=0; i<5; i++)  
		    {  
		      workers.add(new Worker());   
		    }  
		      
		    // We must force the main thread to wait for all the workers  
		    //  to finish their work before we check to see how long it  
		    //  took to complete  
		    System.out.println("Parent waits");
		    for (Worker worker : workers)  
		    {  
		      while (worker.running)  
		      {  
		        Thread.sleep(100);  
		      }  
		    }  
		      
		    Date end = new Date();  
		      
		    long difference = end.getTime() - start.getTime();  
		      
		    System.out.println ("This whole process took: " + difference/1000 + " seconds.");  

	}

}
