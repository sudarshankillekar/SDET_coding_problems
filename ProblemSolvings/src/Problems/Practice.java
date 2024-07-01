package Problems;

import java.util.*;

public class Practice {
	
	public static void main (String[] args) {
		
	String Text = "GeeksforGeeks";
	char [] words = Text.toCharArray();
	
	HashMap <Character , Integer> wordcounter  = new HashMap<>(); 
		
	for(Character ch : words) {
		if(wordcounter.containsKey(ch)) {
			wordcounter.put(ch, wordcounter.get(ch)+1);
		}else
		{
			wordcounter.put(ch, 1);
		}
		
	}
		for(Character word : wordcounter.keySet()) {
			if(wordcounter.get(word)>1);
			System.out.println("Duplicate word "+ word+" number of times repeated "+ wordcounter.get(word));
		}
		
	}
			
	
	
	}
	
	

		
		
		
		
		
	


	
