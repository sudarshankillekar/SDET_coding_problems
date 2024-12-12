package Strings;
//4

import java.util.*;

public class Practice {
	 
	
	public static void main(String[] args) {
	
	 
    String palindrome = "malayalam";
    
    int i = 0;
    int j = palindrome.length()-1;
    int flag  = 0;
    
    while(i<j && flag == 0) {
    	if(palindrome.charAt(i)!=palindrome.charAt(j)) {
    		flag =1;
    		break;
    	}
    	i++;
    	j--;
    }
    
	if(flag == 1) {
		System.out.println("is not palindrome");
	}else {
		System.out.println("is palindrome");
	}
		
	
        
		
		
	}	
		}	
	
	
	
	

		
		
	
	
	
	
	
	


	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
