package Strings;
//4

import java.util.*;

public class Practice {
	  
	public static void main(String[] args) {
	
		int num = 150;
		int temp = num;
		
		int  rem, sum = 0;
		
		while(num>0) {
			
			rem = num%10;
			sum = (rem*rem*rem)+sum;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("is ArmStrong");
		}
		else {
			System.out.println("is not ArmStrong");
		}
		
		
		
		
	
	}
	
	
}
	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
