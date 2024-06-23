package Problems;
import java.util.Arrays;
import java.util.HashMap;

//youtube video link to solve the problem  https://www.youtube.com/watch?v=pyt-RGt7slA&t=423s
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,3};
        System.out.println(Arrays.toString(twoSum(nums,6)));
	
	}
	public static int[] twoSum(int [] nums,int target) {
		
	HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	for (int i = 0; i<nums.length;i++) {
	     int required_Num = target - nums[i];
	     if (hm.containsKey(required_Num)) 
	     {
	    	 int[] arr = {hm.get(required_Num),i};
	    	 return arr;
	    	 }
	     hm.put(nums[i], i);
	     }
	    return null;
	}	
}