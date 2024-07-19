package Problems;

import java.util.*;

public class Practice {
	
	
	
	 static void fibbonacilogic(int n) {
	
		int num1 = 0; int num2 = 1;
		
		for(int i = 0 ; i<n;i++) {
			int num3 = num1+num2;
			System.out.print(num1+" ");
			num1 = num2;
			num2 = num3;
		}
		 
	}
	
	
	public static void main(String[] args) {
		

    int n = 10;
    
    fibbonacilogic(n);
		
		
	}
	
}
   
	


		
		
	


	
