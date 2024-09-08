package Strings;
import java.util.*;
//3
public class LongestSubstring {

	 public static void main(String[] args) {
	        String s = "abccrrkarrlmmn";
	        System.out.println(lengthOfTheLongestSubstring(s));
	    }

	    public static  String lengthOfTheLongestSubstring(String s) {
	        HashMap<Character, Integer> map = new HashMap<>();

	        int start = 0;
	        int maxLen = 0;
	        int maxStart = 0;
	        int maxEnd = 0;

	        for (int end = 0; end < s.length(); end++) {
	            char c = s.charAt(end);
	            if (map.containsKey(c)) {
	                if (start <= map.get(c)) {
	                    start = map.get(c) + 1;
	                }
	            }
	            map.put(c, end);

	            if (end - start + 1 >= maxLen) {
	                maxLen = end - start + 1;
	                maxStart = start;
	                maxEnd = end;
	               // //test 
	            }
	        }
	        return "Length: " + maxLen + ", Substring: " + s.substring(maxStart, maxEnd + 1);
	    }
}
