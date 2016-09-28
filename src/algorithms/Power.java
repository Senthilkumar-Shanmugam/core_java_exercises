package algorithm;

public class Power {

	public static void main(String[] args) {
		 System.out.println(pow(2,4));

	}

	static double pow(int a,int b){
		if(a==0) return 0;
		
		if(b==0) return 1;
		else{
			//return a*pow(a,b-1);
			
			double half = pow(a,b/2);
			System.out.println(half);
			return half*half*((b%2==1) ? a: 1);
		}
	}
}
