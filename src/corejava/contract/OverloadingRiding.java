package common;


interface I1{
	
}
class Impl1 implements I1{
	
}
class Impl2 implements I1{
	
}
public class OverloadingRiding {
	public  void dos(I1 i){
		System.out.println("inside super ");
	}
	public  void dos(Impl1 i){
		System.out.println("inside super ");
	}
	public  void dos(Impl2 i){
		System.out.println("inside super ");
	}
	public  void main(String[] args) {
         I1 o1 = new Impl1();
         Impl1 o2 = new Impl1();
         I1 o3 = new Impl2();
         Impl2 o4 = new Impl2();
         
         

	}

}
