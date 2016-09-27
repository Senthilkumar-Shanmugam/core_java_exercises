package corejava.contract;

import java.io.IOException;

class  SupExp extends Exception{}
class SubExp extends SupExp{}

class Super{
	protected void display() throws SupExp,IOException{
		System.out.println("inside super");
	}
}

class Sub extends Super{
	protected void display() throws SubExp{
		System.out.println("inside super");
	}
}

public class ExceptionOverridingTest {

	public static void main(String[] args) {

	}

}
