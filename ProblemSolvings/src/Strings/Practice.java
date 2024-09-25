package Strings;
//4

import java.util.*;

public class Practice {
	  
	
 public static void main(String[] args) {
	
	 String s = "malayalam";
	 
	 int i = 0;
	 int j = s.length()-1;
	 int flag = 0;
	 
	 while(i<j && flag == 0) {
		 if(s.charAt(i)!=s.charAt(j)) {
			 flag = 1;
		   break;
	 }
	 i++;
	 j--;
 }	 
	 if(flag == 0) {
		 System.out.println("palindrome");
	 }else {
		 System.out.println("not palindrome");
	 }
	 
	
 }
}
 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
