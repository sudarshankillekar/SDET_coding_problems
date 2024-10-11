package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
	
        
	int arr1[] =	{1,2,3,4,5,5,6,6,7};
	int arr2[] =	{1,2,4,5,5,7};
    List<Integer> intersectionOFarr = new ArrayList<>();
    
    intersectionOfArray(arr1, arr2, intersectionOFarr);
	
   System.out.println(intersectionOFarr);
}

	static void intersectionOfArray(int []arr1,int []arr2,List<Integer>addarr) {
		
		
		int i = 0;
		int j = 0;
		
		
		while(i<arr1.length&& j<arr2.length) {
		
		
			while((i<arr1.length-1) && (arr1[i] == arr1[i+1]) ) {
				i++;
							
			}
			
			while((j<arr2.length-1) && (arr2[j] == arr2[j+1]) ) {
				j++;					
			}
			
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			
			else {
				
				addarr.add(arr1[i]);
				i++;
				j++;
			}
			
			
		}
		
		
	}
	
	
}
 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
