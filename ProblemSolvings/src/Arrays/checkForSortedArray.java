public class checkForSortedArray {
    public static int isSorted(int n, int []a) {
        
        
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                // If the current element is greater than the next, the array is not sorted
                return 0;
            }
        }
        // If no elements are out of order, the array is sorted
        return 1;

    }
}
