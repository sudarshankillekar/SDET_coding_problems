package Strings;
import java.util.*;
//3
public class LongestSubstring {

	 public static void main(String[] args) {
		   String text = "abcabcbb";
	        int longest = 0;

	        for (int start = 0; start < text.length(); start++) {
	            String current = "";

	            for (int end = start; end < text.length(); end++) {
	                char ch = text.charAt(end);

	                if (current.contains(String.valueOf(ch))) {
	                    break; // repeated character
	                }

	                current += ch;

	                if (current.length() > longest) {
	                    longest = current.length();
	                }
	            }
	        }

	        System.out.println(longest); // 3 ("abc")
	    } 
	    }
	 
	 

