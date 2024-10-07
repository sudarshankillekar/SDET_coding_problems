package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
		
		
	int arr[] = {1,23,4,6};
	int target = 5;
   System.out.println(Arrays.toString(checkfortwoSum(arr, target)));    
	
	
	}
	
	
	static int[] checkfortwoSum(int []nums,int target) {
		
	HashMap<Integer ,Integer> map = new HashMap<>();
	
	for(int i = 0 ;i<nums.length;i++) {
		
		int req_num = target - nums[i];
		
		if(map.containsKey(req_num)) {
	     int  arr[] =		{map.get(req_num), i};
	       return arr;
		}
		map.put(nums[i], i);
		
		
	}
		return null;
		
		
	}
	
	
}


 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
