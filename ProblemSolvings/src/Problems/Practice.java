package Problems;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
	String text = "Hi , am sudarshan , sudarshan is rahul's friend";
	String [] words  = text.split(" ");
	
	HashMap <String ,Integer> WordCounter = new HashMap <String,Integer>();
	
	for(String word : words) {
		if(WordCounter.containsKey(word)) {
			WordCounter.put(word, WordCounter.get(word)+1);
		}
		else {
			WordCounter.put(word, 1);
		}
	}
		
	for(String word : WordCounter.keySet()) {
		System.out.println("Word \"" + word + "\" occurs " + WordCounter.get(word) + " time(s)");
	}
	
	}
		
}
