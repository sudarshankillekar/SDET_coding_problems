package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		
		String text = "I love Java programming. Java is fun and Java is powerful.";
		
		String [] words = text.split(" ");
		
		HashMap <String , Integer> wordcounter = new HashMap<>();
		
		for (String word : words) {
			if(wordcounter.containsKey(word)) {
				wordcounter.put(word, wordcounter.get(word)+1);
			}
			else {
				wordcounter.put(word,1);
			}
		}
		
		for(String word :wordcounter.keySet()) {
			System.out.println("the word"+word+"is getting repeated these many times "+wordcounter.get(word));
		}
		
		
		
	}
	
}
		
		
		
	


	
