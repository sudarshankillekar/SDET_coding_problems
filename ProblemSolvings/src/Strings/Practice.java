package Strings;
//4

import java.util.*;

public class Practice {
	 
	
	public static void main(String[] args) {
	
	 
   ArrayList<String> tes  = new ArrayList<>();
   tes.add("test");
   tes.add("sudarshan");
   tes.add("hkj");
   tes.add("testgg");
   
   System.out.println(tes);
   
  for(String test :tes) {
	  
	  System.out.println(test);
	 
  }
   
   
  HashMap<Integer, Character> internet = new HashMap<>();
               
  
     internet.put(1, 'a');
     internet.put(1, 'b');
     
     for (Map.Entry<Integer, Character> entry : internet.entrySet()) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     }

     // 2. Iterate through keys
     for (Integer key : internet.keySet()) {
         System.out.println("Key: " + key);
     }

     // 3. Iterate through values
     for (Character value : internet.values()) {
         System.out.println("Value: " + value);
     }
		
	
        
		
		
	}	
		}	
	
	
	
	

		
		
	
	
	
	
	
	


	

	



	
		
		
	
	
	

 
  
 
	
	 
	 
	 

 

 
	

	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
