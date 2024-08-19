package Problems;
//4

import java.util.*;

public class Practice {
	   
  public static void main(String[] args) {
	
	  String s = " abjnoijijdk";
	  
	  HashMap<Character,Integer> map = new HashMap<>();
	  
	  for(int i = 0; i<s.length();i++) {
		  if(map.containsKey(s.charAt(i))) {
			  map.put(s.charAt(i), map.get(s.charAt(i))+1);
		  }
		  else {
			  map.put(s.charAt(i), 1);
		  }
	  }
		  map.forEach((key,value)-> System.out.print(key+"" +value));
	  }
	  
}
  

  
  


  
  





	

	
		


	


		
		
	


	
