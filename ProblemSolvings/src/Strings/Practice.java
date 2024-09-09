package Strings;
//4

import java.util.*;

public class Practice {
	  
	public static void main(String[] args) {
	
	String s  = "Hi My name is Sudarshan and My hobbies are gaming";
	
	String [] splitedWord = s.split(" ");
	
    HashMap<String , Integer> map  = new HashMap<>();
    
    for( String words : splitedWord ) {
    	
    	if(map.containsKey(words)) {
    		map.put(words, map.getOrDefault(words, 0)+1);
    	}else {
    		map.put(words, 1);
    	}	
    }
    
    for( String words : map.keySet()) {	
    	System.out.println(words + " "+ map.get(words) );
    }
    	
	
	
	}
	
	
}
	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
