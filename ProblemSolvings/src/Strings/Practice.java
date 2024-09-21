package Strings;
//4

import java.util.*;

public class Practice {
	  
	
 public static void main(String[] args) {
	
	int []arr = {1,23,3,5,6,2};
	
	int max  = Integer.MIN_VALUE;
	int secMax = Integer.MIN_VALUE;
	
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	
	for(int i = 0 ;i<arr.length;i++) {
		if(arr[i]>secMax && arr[i]<max) {
			secMax = arr[i];
		}
	}
	
	if(secMax == Integer.MAX_VALUE) {
		System.out.println("Second largest element found");
	}else {
		System.out.println(secMax +" second largest element");
	}
	 
	
 }
}
 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
