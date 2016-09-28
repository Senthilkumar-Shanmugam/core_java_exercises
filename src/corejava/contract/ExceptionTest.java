package common;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new MyException2();
		}catch(MyException1 exp1){
			System.out.println("1");
			throw new MyException2();
		}catch(MyException2 exp2){
			System.out.println("2");
		}

	}

}
/*class MyException1 extends Error{}
class MyException2 extends Error{}*/
class MyException1 extends Exception{}
class MyException2 extends MyException1{}