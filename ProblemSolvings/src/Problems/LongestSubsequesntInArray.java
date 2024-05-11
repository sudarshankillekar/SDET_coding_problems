package Problems;
import java.util.*;
public class LongestSubsequesntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    
//	 Scanner sc = new Scanner (System.in);
//	 int n = sc.nextInt();
//	 int []  arr = new int [n];
	 
//	 for(int i = 0; i<arr.length; i++ ) {
		 int [] arr =  {1, 9, 3, 10, 4, 20, 2};
//	 }
	 
	 HashMap <Integer, Boolean> map = new HashMap<>();
		for(int val : arr) {
		map.put(val, true);
	}
    
	for(int val : arr) {
		if(map.containsKey(val-1)) {
			map.put(val, false);
		}
	}
	
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
		
		 System.out.print(i + " ");
     }
}
}