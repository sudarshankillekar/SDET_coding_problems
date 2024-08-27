package Problems;
//4

import java.util.*;

public class Practice {
		
  
	public static void main(String[] args) {
	   
	
		
	String text = "Hi Hi my name is sudarshan and sudarshan is best at coding";
	String [] Splited_word = text.split(" ");
	
	HashMap<String,Integer> map = new HashMap<>();
	
	for(String word : Splited_word) {
		if(map.containsKey(word)) {
			map.put(word, map.get(word)+1);
		}
		else {
			map.put(word, 1);
		}
	}	
		for(String words : map.keySet()) {
			System.out.println(words+" "+map.get(words));
		}
	
	
	
	
	
	
		
	}
  
}

  
  





	

	
		


	


		
		
	


	
