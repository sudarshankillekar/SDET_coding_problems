package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
		
	String str = "malaayalam";
	
	int i = 0, flag = 0;
	
	int j = str.length()-1;
	
	while(i<j & flag == 0) {
		
		if(str.charAt(i)!=str.charAt(j)) {
			flag = 1;
			break;
		}
		i++;
		j--;
		
	}
	
	if(flag == 0) {
		System.out.println("is palindrome");
	}else {
		System.out.println("not palindrome");
	}
	
	
	
		
	}
	
}


 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
