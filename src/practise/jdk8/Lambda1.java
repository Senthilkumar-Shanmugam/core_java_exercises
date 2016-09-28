package practise.jdk8;

@FunctionalInterface
interface isTypeOne{
	public void hasOne();
}

//@FunctionalInterface
interface isTypeTwo{
	public void hasTwo();
}

public class Lambda1 {
	
	public void first(isTypeOne one){
		one.hasOne();
	}
	
	public void second(isTypeTwo two){
		two.hasTwo();
	}
	public void invoke(){
		first(() -> {System.out.println("invoking first");});
		second(() -> { System.out.println("invoking second");});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lambda1 obj = new Lambda1();
		obj.invoke();

	}

}
