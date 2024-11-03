package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
	
		int num = 153;
		int rem ,sum=0;
		int temp =num;
		
		while(num>0) {
			
			rem = num%10;
			
			sum = (rem*rem*rem)+sum;
			
			num = num/10;
			
		}
		
		if(sum == temp) {
			System.out.println("is an armstrong number");
		}else {
			System.out.println("is not an armstrong number");
		}
   }
   	

	
	
}	


	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
