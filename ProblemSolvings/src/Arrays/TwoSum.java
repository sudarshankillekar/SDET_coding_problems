package Arrays;
import java.util.Arrays;
import java.util.HashMap;

//youtube video link to solve the problem  https://www.youtube.com/watch?v=pyt-RGt7slA&t=423s


public class TwoSum {

	public static void main(String[] args) {
	
		int[] arr = {2, 7, 11, 15};
		int target = 9;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++ ) {
				if(arr[i]+arr[j]==target) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}