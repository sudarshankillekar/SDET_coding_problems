package Strings;

import java.util.HashMap;

public class removeduplicatechars {

	
		
		public static void main(String[] args) {

	        String name = "sudarshan";

	        char[] chars = name.toCharArray();

	        HashMap<Character, Integer> map = new HashMap<>();

	        String result = "";

	        for (char ch : chars) {

	            if (!map.containsKey(ch)) {
	                map.put(ch, 1);
	                result = result + ch;
	            }
	        }

	        System.out.println(result);
	    }
  
	
}
