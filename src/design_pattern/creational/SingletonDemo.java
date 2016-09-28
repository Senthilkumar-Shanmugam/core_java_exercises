package design_pattern.creational;

class Singleton {
	private volatile static  Singleton instance = null;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			synchronized(Singleton.class){
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}	
}

public class SingletonDemo {
     public static void main(String [] a){
    	 Singleton obj = Singleton.getInstance();
        // obj.clone();
     }
	
}
