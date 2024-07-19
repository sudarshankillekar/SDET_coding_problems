package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,21,22,90,76,56};
		
		HashMap<Integer,Boolean> map = new  HashMap<>();
		
		for(int val:arr) {
			map.put(val,true);
		}
		
		
		for(int val : arr) {
			if(map.containsKey(val-1)) {
				map.put(val, false);
			}
		}
		
		int msp = 0;
		int ml = 0;
		
		for(int val : arr) {
			if(map.get(val) ==true) {
			int tl = 1;
			int tsp = val;
			
			while(map.containsKey(tl+tsp)) {
				tl++;
			}
			
			if(tl>ml) {
				ml = tl ;
			    msp = tsp;				
			}
		}
	}
			System.out.println("max len"+ml);
			
			for(int i = msp; i < msp+ml;i++) {
				System.out.print(i+" ");
			}
			
		}
		
		
	}
	
	
   
	


		
		
	


	
