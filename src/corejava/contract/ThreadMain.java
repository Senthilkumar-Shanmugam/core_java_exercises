package corejava.contract;

import java.util.HashMap;

 class SynchronousClass {
    public synchronized void lockingMethod(String identify) {
        System.out.println("Hello");
 
        while (true) {
            //Simply loop infinitely
        }
    }
}
public class ThreadMain extends Thread {
    String identifier;
    static HashMap < String, SynchronousClass > instanceMap = new HashMap < String, SynchronousClass > ();
 
    public ThreadMain(String id) {
        identifier = id;
    }
    
    public static void  main(String [] a) throws InterruptedException {
        ThreadMain instance_1 = new ThreadMain("Payoda Tec");
        instance_1.start();
 
        Thread.sleep(2000);
 
        ThreadMain instance_2 = new ThreadMain("Payoda Inc");
        instance_2.start();
    }
 
    public void run() {
        SynchronousClass classReference = null;
        if (instanceMap.containsKey(identifier)) {
            classReference = instanceMap.get(identifier);
        } else {
            classReference = new SynchronousClass();
            instanceMap.put(identifier, classReference);
        }
        classReference.lockingMethod(identifier);
    }
 
  
}
