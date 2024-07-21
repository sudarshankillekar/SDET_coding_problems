package Problems;

import java.util.*;

public class Practice {
	
   static void PrintPair(int [] arr,int n , int sum ) {
	   
	   for(int i = 0 ; i <n ;i++) {
		   for(int j = i+1 ;j<n ; j++) {
			   if(arr[i]+arr[j] == sum) {
				   System.out.println("("+arr[i]+" "+arr[j]+")");
			   }
		   }
	   }
   }
	
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,3,2,2,5,6,-1};
		int n = arr.length;
		int sum = 4 ;
		
		PrintPair(arr, n, sum);
		
	}
	
}

	


		
		
	


	
