package Problems;
//4

import java.util.*;

public class Practice {
		
  
	public static void main(String[] args) {
		
	   int [] nums = {1,3,4,5,4};
	   int target = 4;
	   
	  
	   System.out.println( Arrays.toString(printpairSum(nums, target)));
		
	}
	
	
		   
	public static int []  printpairSum(int [] nums ,int target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i<nums.length;i++) {
            int req_num =  target - nums[i];
			if(map.containsKey(req_num)) {
			int [] arr =	{ map.get(req_num),i};
			return arr;
			}
				map.put(nums[i],i);
			}
			return null;	
		}
		
	}
  


  
  





	

	
		


	


		
		
	


	
