package Problems;

import java.util.HashMap;

public class duplicateCharactersCounter {
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
        	if(wordCount.get(word)>1)
            System.out.println("Word \"" + word + "\" occurs " + wordCount.get(word) + " time(s)");
        }
    }
}

