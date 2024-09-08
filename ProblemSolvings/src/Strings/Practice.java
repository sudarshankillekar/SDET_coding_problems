package Strings;
//4

import java.util.*;

public class Practice {
	  
	public static void main(String[] args) {
		String str =  " sudarshan is name my ";
	   String [] splitedString = str.split(" ");
	   List<String> reversedlist = new ArrayList<>();
 		for( int i=splitedString.length-1;i >= 0;i--) {
			reversedlist.add(splitedString[i]);
	        
		}
		
		
 		  String reversedString = String.join(" ", reversedlist);
 	        System.out.println(reversedString.trim());
		
    }
	
	
	}
	
	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
