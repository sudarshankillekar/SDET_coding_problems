package Arrays;

public class secondLargestElementInAnArray {

	public static void main(String[] args) {
		
		 int[] arr = {4, 2, 3, 1, 5};

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

	        // Find the second largest element
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > secondMax && arr[i] < max) {
	                secondMax = arr[i];
	            }
	        }

	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found");
	        } else {
	            System.out.println("Second largest element is: " + secondMax);
	        }
	    }
	
		

	}


