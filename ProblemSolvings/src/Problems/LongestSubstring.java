package Problems;
import java.util.*;

public class LongestSubstring {

	 public static void main(String[] args) {
	        String s = "yourteststring";
	        LongestSubstring obj = new LongestSubstring();
	        System.out.println("Length of the longest substring: " + obj.lengthOfTheLongestSubstring(s));
	    }

	    public String lengthOfTheLongestSubstring(String s) {
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

	            if (end - start + 1 > maxLen) {
	                maxLen = end - start + 1;
	                maxStart = start;
	                maxEnd = end;
	            }
	        }

	        System.out.println("Longest substring: " + s.substring(maxStart, maxEnd + 1));
	        return "Length: " + maxLen + ", Substring: " + s.substring(maxStart, maxEnd + 1);
	    }
}
