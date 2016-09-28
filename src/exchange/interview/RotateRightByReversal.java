package exchange.interview;

import java.util.Arrays;

/*
 * Program to rotate integer array by N positions using reversal
 * algorithm . Time complexity O(n), Space complexity O(1)
 * 
 */
public class RotateRightByReversal {

	public static void main(String[] args) {

      int[] numbers = new int[]{1,2,3,4,5,6};
      int n=2;
      System.out.println(Arrays.toString(numbers));
      System.out.println("rotated to the right " + n + " is:");
      rotateRightByNPlaces(numbers, n);
      System.out.println(Arrays.toString(numbers));
	}

	
	private static void rotateRightByNPlaces(int[] numbers, int n){
	  if(( numbers == null) || 	numbers.length < 3)
		  return;
	  
	  int length = numbers.length;
	  int pivot = length-n;
	  reverseRight(numbers,0,pivot-1);
	 // System.out.println(Arrays.toString(numbers));
	  reverseRight(numbers,pivot,length-1);
	//  System.out.println(Arrays.toString(numbers));
	  reverseRight(numbers,0,length-1);
	}
	
	private static void  reverseRight(int[] numbers,int start,int end){
		int temp;
		
		while(start<end){
			temp = numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
	}
}
