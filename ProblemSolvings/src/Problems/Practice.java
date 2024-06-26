package Problems;

import java.util.*;

public class Practice {
		
	public static void main(String[] args){

		int[] nums = {3,3,5,5} ;
		System.out.println(Arrays.toString(twoSum(nums,10)));

		}

		static int [] twoSum(int [] nums , int target){

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for(int i = 0 ; i<nums.length;i++){

		int requ_num = target - nums[i];

		if(hm.containsKey(requ_num)){
		 int [] arr = {hm.get(requ_num),i};
		 return arr;
		}
		else
		{
		hm.put(nums[i],i);
		}
		}
		return null;
		}
}
