package common;

public class AbstractClass {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		GenericNumber number  = new GenericNumber(){
	/*		public int toBase10(){
				return 0;}
		};
*/
		 Object obj = new Object(){
			 public boolean equals(Object o){
				 return true;
			 }
		 };
		// System.out.println(obj.equals("H"));
		 
		 int i = 3;
		 
		 if(++i == 4 || i++ > 6 || i++ > 5)
			 if(++i < 10 | i++ > 0)
				 System.out.println(i);
	}

}
abstract class GenericNumber{
	private String digits;
	private int base;
	public GenericNumber(int base){
		this.base= base;
		System.out.println("con");
	}
	public void setDigits(String d){
		this.digits = d;
	}
	public abstract int toBase10();
	
}