package common;

public class FunctionHidingExample {

	public static void main(String[] args) {
      //  A.display();
        //B.display();
		A a = new A();
		A b = new B();
		a.display();
		b.display();
		B c = new B();
		c.display();
		A a1 = null;
        a1.display();
	}

}

class A{
	public static void display(){
		System.out.println("inside Super A");
	}
}
class B extends A{
	public static void display(){
		System.out.println("inside sub B");
	}
}