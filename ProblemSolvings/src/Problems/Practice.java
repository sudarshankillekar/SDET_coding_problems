package Problems;

import java.util.*;

public class Practice {
	
	
	public static void main(String[] args){

		int num = 19;
		int count = 0;
		
		if(num > 1) {
			
			for(int i = 1; i<=num ; i++) {
				if(num%i == 0) 
					count++;
				}
			    if(count ==2) {
			    	System.out.println("is an prime number");
			    }
			    else {
			    	System.out.println("is not a prime number");
			    }
			    }			
			else {		 			
		     System.out.println();		
	     }
        }
		
	}
		
		
		
		
	


	
