package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
  
	int [] nums = {2,9,8,1};
	int target = 3;
	System.out.println(Arrays.toString(twosumlogic(nums, target)));
		
	}	
	
	static int[] twosumlogic(int[] nums ,int target) {
	
		HashMap<Integer,Integer>  map = new HashMap<>();
		
		for(int i = 0;i<nums.length;i++) {
			int req_num = target - nums[i];
			if(map.containsKey(req_num)) {
				int [] arr = {map.get(req_num),i};
				return arr;
			}
			map.put(nums[i], i);
		}
		return null;		
	}
	
	
	
	}

	
	
		


	


		
		
	


	
