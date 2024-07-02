package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		
	int[] arr = {99,98,17,9,2,100,5,101};
	
	HashMap<Integer , Boolean> Map = new HashMap<>() ;
	
	for(Integer val : arr) {
		Map.put(val, true);	 		
	}
	
	for(Integer val : arr) {
		if(Map.containsKey(val - 1)) {
			Map.put(val, false);
		}
	}
	
	
	int ml = 0;
	int msp = 0;
	for(Integer val : arr) {
		if(Map.get(val) == true) {
			int tl  = 0;
			int tsp = val;
		
	 while(Map.containsKey(tl+tsp)) {
		 tl++;
	 }
	 
	 if(tl>ml) {
		 ml = tl;
		 msp = tsp;
		
	 }	 
	}	
}	
	 System.out.println("Maximum length is " +ml);
	 for(int i = msp ;i<ml+msp;i++) {
		 System.out.print(i+" ");
	 }
	}
	
}
		



		
		
		
		
	


	
