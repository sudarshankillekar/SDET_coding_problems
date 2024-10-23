package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
	
   String s   = "malaayalam";
   
   int i = 0 ,flag = 0;
   int j = s.length()-1;
   
   while(i<j&& flag ==0) {
	   if(s.charAt(i)!=s.charAt(j)) {
		   flag = 1;
		   break;
	   }
	   i++;
	   j--;
   }
   
   if(flag ==1) {
	   System.out.println("no");
   }else {
	   System.out.println("yes");
   }
		
	
		

		
		
	}
	

	}
	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
