package Strings;
//4

import java.util.*;

public class Practice {
	 
	
	public static void main(String[] args) {
	
     String text = "My name is sudarshan and sudarshan is very inteligent";
	
     String test [] = text.split(" ");
     
     HashMap<String, Integer> map = new HashMap<>();
     
     for(String Text:test) {
    	 
    	 if(map.containsKey(Text)){
    		 map.put(Text, map.get(Text)+1);	 
    	 }else {
    		 map.put(text, 1);
    	 }
    	 
     }
     
		
     for(String result:map.keySet()) {
    	 System.out.println(result +" "+ map.get(result));
     }
		
		}	
	
}
	
	

		
		
	
	
	
	
	
	


	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
