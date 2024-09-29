package Strings;
//4

import java.util.*;

public class Practice {
	  

	public static void main(String[] args) {
		
	String words = "sudarshan gopal killekar";
	
	String [] splitedWord = words.split(" ");
	
	StringBuilder builder = new StringBuilder(splitedWord[2]);
	
	splitedWord[2] =   builder.reverse().toString();
	
	 String Rev =     String.join(" ", splitedWord);
	
	System.out.println(Rev);	
		
	
	
	}
 }	
	
	 
 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
