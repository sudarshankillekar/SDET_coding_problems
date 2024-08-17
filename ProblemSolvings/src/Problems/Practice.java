package Problems;
//4

import java.util.*;

public class Practice {
	   
  public static void main(String[] args) {
	int nums[] = {6,3};

	 System.out.println(Arrays.toString(twoSum(nums,9)));
	  }

  static int[] twoSum(int [] nums,int target) {
	  
	  HashMap<Integer,Integer> Map = new HashMap<>();
	  
	  for(int i = 0 ; i<nums.length;i++) {
		  
		  int req_num = target-nums[i];
		  
		  if(Map.containsKey(req_num)) {
			  int[] arr = {Map.get(req_num),i};
			  return arr;
		  }
		  Map.put(nums[i],i);
	  }
	  return null;
  }
}

  
  
  


  
  





	

	
		


	


		
		
	


	
