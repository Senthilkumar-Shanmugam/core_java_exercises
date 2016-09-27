package corejava.contract;

class Base {
  public static void show(){
	  System.out.println(".. Inside Base show....");
  }
}

public class StaticInherit extends Base {
	
	//@Override  cannot be applied, they cannot be overriden
	 public static void show(){
		  System.out.println(".. Inside child show....");
	  }
	
	
	  public static void main(String[] args) {
	       // System.out.println("Hello");
		 // Base obj = new StaticInherit();
		  Base obj = null;
		  //StaticInherit.show();
		  obj.show();
	    }
	
}
