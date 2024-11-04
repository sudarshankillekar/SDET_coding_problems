package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
	
     int arr [] = {1,1,0,1,0,1,1,1,1};
     int count =0;
     int MaxCount = 0;
     for(int i = 0;i<arr.length;i++) {
    	 if(arr[i] == 1 ) {
    		 count++;
    	 }else {
    		count =  0;
    	 }
    	 MaxCount =	Math.max(MaxCount, count);
     }
	
	
	System.out.println(MaxCount);
   }
   	

	
	
}	


	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
