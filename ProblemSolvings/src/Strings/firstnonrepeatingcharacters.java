package Strings;

import java.util.HashMap;

public class firstnonrepeatingcharacters {

	public firstnonrepeatingcharacters() {
		// TODO Auto-generated constructor stub
		String name = "sdarshan";
	    
	     char charss[] =  name.toCharArray();
	    
	    HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
			
	    
	    for(Character chars :charss) {
	    	
	      if(map.containsKey(chars)) {
	    	  map.put(chars, map.get(chars)+1);
	      }else {
	    	  map.put(chars, 1);
	      }
	    	
	    }
			
	    
	    for(Character chars: charss) {
	    	if(map.get(chars)==1) {
	    		System.out.println(chars);
	    		break;
	    	}
	    }
	    
			
		}

}
