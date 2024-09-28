package Strings;
//4

import java.util.*;

public class Practice {
	  
	
 public static void main(String[] args) {
	
	
	 String s1 = "silent";
	 String s2 = "listn";
	 
	 
	 System.out.println(anagram(s1, s2));
 }	 
	 
	static boolean anagram(String s1,String s2) {
		
	
    
	String str1 =	s1.replaceAll("//s", "");
	  String str2 =  s2.replaceAll("//s", "");
	
	
	if(s1.length()!=s2.length()) {
		return false;
	}else {
		
     char[] c1=  str1.toLowerCase().toCharArray();
     char[] c2 = str2.toLowerCase().toCharArray();
	
   	 Arrays.sort(c1);
   	 Arrays.sort(c2);
   	 
   	   return  Arrays.equals(c1, c2);

	}
	
		
		
		
	}
	 
	
	
 
	 
 } 
	
	 
	 
	 
	
 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
