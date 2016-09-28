package com.concurrency.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) {
		 ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
	      Thread producer = new Thread(new Producer(queue));
	      Thread consumer = new Thread(new Consumer(queue));
	      producer.start();
	      consumer.start();
	}

}

class Producer implements Runnable {
	ConcurrentLinkedQueue<String> queue;

	Producer(ConcurrentLinkedQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {
		System.out.println("Producer Started");
		try {
			for (int i = 1; i < 10; i++) {
				queue.add("String" + i);
				System.out.println("Added: String" + i);
				Thread.currentThread().sleep(2000);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Producer is done");
	}
}

// the consumer removes strings from the queue
class Consumer implements Runnable {
	 
	   ConcurrentLinkedQueue<String> queue;
	   Consumer(ConcurrentLinkedQueue<String> queue){
	      this.queue = queue;
	   }
	   public void run() {
	      String str;
	      int c= 1;
	      System.out.println("Consumer Started");
	      
	      while(c<10)
	         while ( (str = queue.poll()) != null) {
	            System.out.println("Removed: " + str+ "<<so far :"+c);
	            c++;
	         }
	   
	         /*try {
	            Thread.currentThread().sleep(500);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }*/
	     
	 
	       System.out.println("Consumer is done");
	   }
	}