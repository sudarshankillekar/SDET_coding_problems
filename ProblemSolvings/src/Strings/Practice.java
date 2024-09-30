package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
		

		int arr [] = {12,5,45,6,87,9};
		
		
		int max = arr[0];
		int secondmax  = arr[0];
	
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}	
//		System.out.println(max);
 
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>secondmax && arr[i]<max){
				 secondmax = arr[i];
			}
		}
		
		System.out.println(secondmax);
	}
	
	
}	 
 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
