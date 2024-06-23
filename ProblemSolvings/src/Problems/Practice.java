package Problems;

import java.util.*;

public class Practice {

		public static void main(String[]  args){

		int [] nums = {3,3};

		System.out.println(Arrays.toString(driverCode(nums,6)));

		}
	
		public static int[] driverCode(int [] nums , int target) {

		HashMap <Integer ,Integer> hm = new HashMap<>();

		for(int i = 0 ; i < nums.length;i++ ){

		int req_num = target - nums[i];

		if(hm.containsKey(req_num)){
		int[] arr = {hm.get(req_num),i};
		return arr;
		}
		else
		hm.put(nums[i],i);
		} 
		return null;
		}		
		
}
