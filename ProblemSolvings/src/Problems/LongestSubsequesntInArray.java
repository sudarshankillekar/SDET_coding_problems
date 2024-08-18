package Problems;
import java.util.*;
public class LongestSubsequesntInArray {

	public static void main(String[] args) {
		 int [] arr =  {6,3,1,2,34,23,12};
		 
	 HashMap <Integer, Boolean> map = new HashMap<>();
		for(int val : arr) {
		map.put(val, true);
	}
    
	for(int val : arr) {
		if(map.containsKey(val-1)) {
			map.put(val, false);
		}
	}
	//tl is temp length
	//tsp is temp start point
	//msp is maximum start point 
	//ml is maximum length
	int msp = 0;
	int ml = 0;
	
	for(int val : arr) {
		if(map.get(val)==true) {
			int tl = 1;
			int tsp = val;
	
		while(map.containsKey(tsp+tl)) {
			tl++ ;
		}
		if(tl>ml) {
			ml = tl;
			msp = tsp;
		}
		}   
	}
	 System.out.println("Longest Subsequence length: " + ml);
	for (int i = msp; i < msp + ml; i++) {
		
		 System.out.print(i + " ");     }
}
}