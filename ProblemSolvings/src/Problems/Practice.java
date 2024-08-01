package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {

    int [] arr = {22,99,102,21,89,33,23,111};

    HashMap<Integer,Boolean> Map = new HashMap<>();
    
    for(int val : arr) {
    Map.put(val, true);
    }
    
    for(int val : arr) {
    	if(Map.containsKey(val-1)){
    		Map.put(val, false);
    	}
    }
    
	int ml = 0;
	int msp = 0;
	
	for(int val : arr) {
		if(Map.get(val) == true) {
			int tl = 1;
			int tsp = val;
		
	while(Map.containsKey(tsp+tl)) {
	       tl++;	
	}
		if(tl>ml) {
			 ml =tl;
			  msp=tsp;
		}
		}	
	}
		System.out.println("longest subsequent in an element "+ml);
		for(int i = msp ;i<msp+ml;i++) {
			System.out.print(i+" ");
		}
		
	}
	}
	
	
	
		


	


		
		
	


	
