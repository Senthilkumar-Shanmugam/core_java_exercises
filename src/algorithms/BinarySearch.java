package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+binarySearch(arr, 14));

	}
	
	public static int binarySearch(int[] arr,int key){
		int start = 0;
		int end= arr.length-1;
		
		while(start <=  end){
		int mid = (start+end)/2;
		
		if(key==arr[mid])
			return mid;
		else if(key<arr[mid]){
			end=mid-1;
		}else{
			start=mid+1;
		}
		
		}
		return -1;
		
	}

}
