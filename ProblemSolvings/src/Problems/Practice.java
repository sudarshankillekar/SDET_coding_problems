package Problems;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
	
	String Text  = "Sudarshan is an good person , Sudarshan has powerfull will to do anything";

	String words [] = Text.split(" ");

	HashMap <String ,Integer> WordCount = new HashMap<String,Integer>();

	for(String word : words){

	if(WordCount.containsKey(word)){
	WordCount.put(word,WordCount.get(word)+1);
	}
	else{
	WordCount.put(word,1);
	}
	}
	for(String word : WordCount.keySet()){
	System.out.println("Word \"" + word + "\" occurs " + WordCount.get(word) + " time(s)");
	}
}
	}