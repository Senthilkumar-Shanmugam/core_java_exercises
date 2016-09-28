package exchange.interview;

/*
 * Rotate an Array of INtegers by N
 * using juggling alogrithm
 */
public class RotateArray {

	public static void main(String[] args) {
		int numbers[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
		int rotateBy = 3;
  
		numbers = rotateArraybyNplaces(numbers,rotateBy);
	}

	
	private static int[] rotateArraybyNplaces(int []numbers,int rotateBy){
		int n=numbers.length;
		int groupSize = gcd( n ,rotateBy);
		
		for(int i=0; i<groupSize; i++)
		{
			int temp = numbers[i];
			int j=i;
			int k=0;
			while(true)
			{
				k = j+rotateBy;
				if(k >= n)
				 k = k-n;
				if(k==i)
				 break;
				numbers[j] = numbers[k];
                j = k; 
			}
			numbers[j] = temp;
		}
		return numbers;
	}
	//return the GCD of two numbers
	private static int gcd(int a, int b)
	{
		if(b==0)
		 return a;
		else return gcd(b,a%b); 
	}
}
