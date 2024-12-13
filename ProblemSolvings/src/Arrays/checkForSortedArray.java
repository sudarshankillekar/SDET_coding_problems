package Arrays;

public class checkForSortedArray {
    public static int isSorted(int n, int []a) {
        
        
        for (int i = 0; i < n -1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        // If no elements are out of order, the array is sorted
        return 1;
//
    }
    public static void main(String[] args) {
		
    	int []arr = {1,3,4,5,6,2};
     	int n = arr.length;
				 
		System.out.println(isSorted(n, arr));
    	
//    	
 //   	
	}
}
