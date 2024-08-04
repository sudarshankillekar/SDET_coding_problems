package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		
		String s = "uhsnfbfhoewuyufhofuiwfhwfwf";
		System.out.println(LengthOfLongestSubstring(s));  
		
}
	
	static String LengthOfLongestSubstring(String s) {
		
		HashMap<Character,Integer>map  = new HashMap<>();
		
		int start = 0;
		int maxlength = 0;
		int maxstart =0;
		int maxend =0;
		
		for(int end  = 0; end<=s.length();end++) {
			char c  = s.charAt(end);
			if(map.containsKey(c)) {
			    if(start <= map.get(c)) {
			    	start = map.get(c)+1;
			    }
			}
			map.put(c,end);
		
		
		if(end-start + 1 >= maxlength) {
			maxlength = end-start+1;
			maxstart = start;
			maxend = end;
		}
		}	
		
		return "maxlenght"+maxlength+s.substring(maxstart,maxend+1);
	}
	
	}
	
	
	
	
	

	
		


	


		
		
	


	
