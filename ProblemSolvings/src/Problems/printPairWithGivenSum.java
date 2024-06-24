package Problems;

public class printPairWithGivenSum {

    static void printPairs(int arr[], int n, int sum)
    {
        // int count = 0;

        // Consider all possible pairs
        // and check their sums
    	
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == sum)
                    System.out.println("(" + arr[i] + ", "
                                       + arr[j] + ")");
    }

    // Driver Code
    public static void main(String[] arg)
    {
        int arr[] = {1,3,2,2,5,6,-1};
        int n = arr.length;
        int sum = 4;
        printPairs(arr, n, sum);
    }
}
	

