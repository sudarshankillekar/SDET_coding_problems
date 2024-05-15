package Problems;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		String Text = "GeeksforGeeks";
		
		char words [] = Text.toCharArray();
		
		HashMap <Character ,Integer> wordcount = new  HashMap<>();
		
		for(Character ch : words) {
			if(wordcount.containsKey(ch)) {
				wordcount.put(ch, wordcount.get(ch)+1);
			}
			else
			wordcount.put(ch, 1);
		}
				
		for(Character word : wordcount.keySet()) {
			if(wordcount.get(word)>1) {
				System.out.println(word+" "+wordcount.get(word));
			}
		}
	
		
	}
       

}
		

