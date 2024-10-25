package Arrays;

import java.util.Arrays;

public class leftRotateTheArrayByDplacese {

	 public static void main(String[] args) {
		    
	        int[] nums = {1, 2, 3, 4, 5, 6};
	        int k = 2;
	        
	        System.out.println("Original array: ");
	        printArray(nums);

	        // Rotate left by k positions
	        rotateLeftUsingReverse(nums, k);
	        System.out.println("Array after rotating left by " + k + " positions: ");
	        printArray(nums);
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

	    // Rotate array left using reverse
	    public static void rotateLeftUsingReverse(int[] arr, int k) {
	        k %= arr.length;  // Ensure k is within array bounds

	        // Reverse the first k elements
	        reverse(arr, 0, k - 1);

	        // Reverse the remaining elements
	        reverse(arr, k, arr.length - 1);

	        // Reverse the entire array to complete the left rotation
	        reverse(arr, 0, arr.length - 1);
	    }

	    // Helper function to print the array
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
		  
	}


