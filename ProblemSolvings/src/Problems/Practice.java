package Problems;
//4

import java.util.*;

public class Practice {
		
  
	public static void main(String[] args) {
	   
    String name = "sudarshan";
    
    HashMap<Character,Integer> map = new HashMap<>();
    
    for(int i = 0;i<name.length();i++) {
    	
    	if(map.containsKey(name.charAt(i))) {
    		map.put(name.charAt(i), map.get(name.charAt(i))+1);
    	}else {
    		map.put(name.charAt(i), 1);
    	}
    }
    	map.forEach((Key,Value) -> System.out.print(Key+""+Value));
    	
    }
    		
		
		
		
		
		
		
    
	}
  


  
  





	

	
		


	


		
		
	


	
