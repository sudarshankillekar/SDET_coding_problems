package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
	
		int []arr = {1,2,3,4,5,6};
		System.out.println(checkForSorted(arr));
		
		
		}  
	
	
	static String checkForSorted(int []arr) {
		

		for(int i = 0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) 
				return "is not sorted";		
		}	
	
	 return "is sorted";
	}
	
}
	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
