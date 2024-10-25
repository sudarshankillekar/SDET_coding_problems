package Arrays;

import java.util.Arrays;

public class leftRotateTheArrayByDplacese {

	public static void main(String[] args) {
	
		int [] nums = {1,2,3,4,5,6};
		int start = 0 ,end = 5;
		int k = 2;
		
	    System.out.println("Original array: ");
	    printArray(nums);

	    // Reverse the array from start to end
	    reverse(nums, start, end);
	    System.out.println("Array after reverse from start to end: ");
	    printArray(nums);

	    // Rotate left by k positions
	    rotateLeftUsingReverse(nums, k);
	    System.out.println("Array after rotating left by " + k + " positions: ");
	    printArray(nums);
	   
		reverse(nums, start, end);
		rotateLeftUsingReverse(nums, k);
	}
	 // Helper function to reverse an array from start index to end index	  
	public static void reverse(int[] nums, int start, int end) {
		    while (start < end) {
		      int temp = nums[start];
		      nums[start] = nums[end];
		      nums[end] = temp;
		      start++;
		      end--;
		    }
		  }

		  public static void rotateLeftUsingReverse(int[] arr, int k) {
		    k %= arr.length;

		    // Reverse all numbers
		    reverse(arr, 0, arr.length - 1);

		    // Reverse first arr.length-k numbers
		    reverse(arr, 0, arr.length - k - 1);

		    // Reverse last k numbers
		    reverse(arr, arr.length - k, arr.length - 1);
		  }

		  public static void printArray(int[] arr) {
			    for (int num : arr) {
			        System.out.print(num + " ");
			    }
			    System.out.println();
			}
		  
	}


