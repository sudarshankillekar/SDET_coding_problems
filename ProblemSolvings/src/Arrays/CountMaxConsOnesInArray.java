package Arrays;

public class CountMaxConsOnesInArray {

	public static void main(String[] args) {
		
		 int arr[] = {1, 1,0, 1,1,1};
		    int maxCount = 0;  
		    int currentCount = 0;  

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] == 1) {
		            currentCount++;  
		        } else {
		           currentCount = 0;
		        }

		           maxCount =     Math.max(maxCount, currentCount);
		    }	        
		    System.out.println(maxCount);
		    
		    
		

	

}
}