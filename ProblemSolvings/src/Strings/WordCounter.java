package Strings;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "I love Java programming. Java is fun and Java is powerful." ;
        String[] words = text.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word)+1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            System.out.println("Word \"" + word + "\" occurs " + wordCount.get(word) + " time(s)");
        }
    }
}

