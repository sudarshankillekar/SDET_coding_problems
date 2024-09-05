package Problems;

import java.util.HashMap;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {

	String input = "madam";
	
	char inputarray [] = input.toCharArray();
	
	HashMap<Character, Integer> map =  new HashMap<>();
	
	for( char character :inputarray) {
		if(map.containsKey(character)) {
			map.put(character,map.get(character)+1);
		}else {
			map.put(character, 1);
		}
	}
		
	for(char ch : map.keySet()) {
		System.out.println(ch +" "+map.get(ch));
	}
		


	}

}
