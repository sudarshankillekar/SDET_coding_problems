package Strings;

import java.util.HashMap;

public class duplicateCharactersCounter {
	
	

//	 String s  = "IambestasSDETE";
//	  char [] words = s.toCharArray();	  
//	  HashMap <Character ,Integer> map = new HashMap<>() ;
//	  
//	  
//	  for(Character ch : words) {
//	  if(map.containsKey(ch)) {
//		  map.put(ch, map.get(ch)+1);
//	  }else {
//	  map.put(ch,1);
//	  }
//	  }
//	  
//	 for(Character word : map.keySet()) {
//		 if(map.get(word)>2) 
//			 System.out.println("Words"+word+"Appears"+map.get(word)+"times");
//		 
//	 }	
    public static void main(String[] args) {
        String text = "geeksforgeeks" ;
        char [] words = text.toCharArray();
        HashMap<Character, Integer> wordCount = new HashMap<>();

        for (Character ch : words) {
            if (wordCount.containsKey(ch)) {
                wordCount.put(ch, wordCount.get(ch)+1);
            } else {
                wordCount.put(ch, 1);
            }
        }

        for (Character word : wordCount.keySet()) {
        	if(wordCount.get(word)>=2)
            System.out.println("Word \"" + word + "\" occurs " + wordCount.get(word) + " time(s)");
        }
    }
}

