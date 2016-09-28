package com.concurrency.thread.pools;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemoTwo {

	public static void main(String[] args) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,100,TimeUnit.MILLISECONDS,
        		                                                     new LinkedBlockingQueue<Runnable>(),new MyThreadFactory(),
        		                                                     new ThreadPoolExecutor.CallerRunsPolicy());
        executor.execute(new BookReader("Mantra"));
        executor.execute(new BookReader("Karbla"));
        executor.execute(new BookReader("Sipahi"));
        System.out.println("Completed Task:"+ executor.getCompletedTaskCount());
        System.out.println("Old Core Pool Size:"+ executor.getCorePoolSize());
        executor.setCorePoolSize(3);
        System.out.println("New Core Pool Size:"+ executor.getCorePoolSize());
        executor.shutdown();
	}

}

/*
 * This is the class used to create threads for thread pool
 */
class MyThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY );
		System.out.println("---Thread Created---");
		return t;
	}
} 