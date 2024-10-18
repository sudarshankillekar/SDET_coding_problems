package Arrays;

import java.util.Arrays;

public class TopTwoElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {100};

	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements");
	            return;
	        }

	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;

	        // Find the largest element
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println(max);
	        
	        // Find the second largest element
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > secondMax && arr[i] < max) {
	                secondMax = arr[i];
	            }
	        }

	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found");
	        } else {
	            System.out.println(secondMax);
	        }
	}
		
	}


