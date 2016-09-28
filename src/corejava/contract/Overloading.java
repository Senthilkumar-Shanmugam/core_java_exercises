package common;

public class Overloading {

	public static void main(String[] args) {
		Overloading test = new Overloading();
         Animal a = new Tiger();
         Tiger t = new Tiger();
         test.identify(a);
         test.idntify(t);
	}
	
	public void identify(Animal a){
		System.out.println("animal");
	}
	public void idntify(Tiger t){
	System.out.println("tiger");	
	}

}
class Animal{}
class Tiger extends Animal{}