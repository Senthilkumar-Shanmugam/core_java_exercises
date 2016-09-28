package sorting;

import java.util.Arrays;
import java.util.Scanner;

/* Also known as sinking sort works by repeatedly stepping through the list to be
 *  sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list
 *  is repeated until no swaps are needed, which indicates that the list is sorted
 * 
 * Bubble sort has worst-case and average complexity both О(n2), where n is the
 *  number of items being sorted. There exist many sorting algorithms with
 *   substantially better worst-case or average complexity of O(n log n).
 *    Even other О(n2) sorting algorithms, such as insertion sort, tend to have 
 *    better performance than bubble sort. Therefore, bubble sort is not a practical
 *     sorting algorithm when n
 *is large.Performance of bubble sort over an already-sorted list (best-case) is O(n)
 */


public class BubbleSort {

	public static void main(String[] args) {
		
       Scanner in = new Scanner(System.in);
       
       System.out.println("Input number of integers to sort");
       int n = in.nextInt();
    
       int array[] = new int[n];
    
       System.out.println("Enter " + n + " integers");
       for (int c = 0; c < n; c++) 
    	      array[c] = in.nextInt();
       
       System.out.println("Before sorting="+Arrays.toString(array));
      for(int i= array.length-1;i>=0;i--)
      // for(int i=0;i<array.length;i++)
    	   for(int j = 1 ; j<=i;j++){
    		   if(array[j-1]> array[j]){
    			   int temp = array[j-1];
    			   array[j-1]=array[j];
    			   array[j]=temp;
    		   }
    	   }
       System.out.println("after sorting="+Arrays.toString(array));
	}

}
