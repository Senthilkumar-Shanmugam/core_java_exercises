package common;

import java.util.ArrayList;
import java.util.List;

public class TestPassbyVal {
	
	void TestPassbyVal(){
		
	}
	public static void add(float f){
		System.out.println("F+PI="+f+3.14);
	}

	public static void main(String[] args) throws ClassNotFoundException {
	   Test object = new Test("senthil");
	   byte b = 1;
	   add(1/2);
	   add(3.14f);
	   
	  /* while(b++ > 0){
		   b &=b;
		   System.out.println(b);
	   }*/
	   
	   int n=2000000000;
	   System.out.println(n*n);
	   
	   TestPassbyVal one = new TestPassbyVal();
	/*   int i=9;
	   
	   switch(i){
	      default : System.out.println("d");break;
	      case 0 : System.out.println("0");
	      case 1 : System.out.println("1");
	   
	   }*/
	/*   String s = "arun";
       testPassbyRef(s);
        System.out.println(s);*/
	    
	   List<String> l1 = new ArrayList<String>();
	   List<Integer> l2 = new ArrayList<Integer>();
	   
	   System.out.println(l1.getClass());
	  // Class.forName("");
	}

	
	public static void testPassbyRef( String obj){
		obj="ss";
		//obj.setName("charu");
		//obj = new Test("charu");
	}
}



class Test{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Test(){}
	Test(String s){name=s;}
   public String toString(){
	  return "name:"+name; 
   }
}