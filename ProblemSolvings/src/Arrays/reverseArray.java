package Arrays;

import java.util.Arrays;

//3
public class reverseArray {

	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6};
		int start = 0;
		int end = arr.length-1;
		reversedArray(arr, start, end);
	}
	
	   static void reversedArray(int arr[], int start, int end) { 
	        int temp; 
	        while (start < end) { 
	            temp = arr[start]; 
	            arr[start] = arr[end]; 
	            arr[end] = temp; 
	            start++; 
	            end--; 
	        } 
	        
	        System.out.println(Arrays.toString(arr));
	    } 

	 
	
}
