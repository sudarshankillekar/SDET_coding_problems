package Problems;

public class findMissingNumber {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,7,8,9,10};
		
		int sum1 = 0;
		
		for(int i = 0; i<a.length;i++) {
			sum1 = sum1+a[i];
		}
        
	    int sum2 = 0;
	    
	    for(int i = 1; i<=10;i++) {
	    	sum2 = sum2+i;
	    }
	   
	    System.out.println("missing number in the array is " +(sum2-sum1));
	}

}
