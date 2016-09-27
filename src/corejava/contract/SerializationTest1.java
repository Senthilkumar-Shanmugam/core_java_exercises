package corejava.contract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A{
	public  String name;
	public  int age;
	
	
	public A(){
		System.out.println(" ..inside A cons ..");
		//this.name="senthil";
		//this.age=35;
	}
}

class B   extends A  implements Serializable{
	public  String place;
	static int count;
	B(){
		
		super();
		System.out.println("inside B cons");
		
		//this.place="chennai";
	}

	@Override
	public String toString() {
		return "B [place=" + place + ", name=" + name + ", age=" + age + "]"+",count="+count;
	}
	
	
}
public class SerializationTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
  /*    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1"));
      B obj = new B();
      obj.age=36;
      obj.name="senthil";
      obj.place="chennai";
      obj.count=100;
      out.writeObject(obj);*/
     B.count=121;
      System.out.println("deserializing..");
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1"));
       System.out.println(in.readObject());
	}

}
