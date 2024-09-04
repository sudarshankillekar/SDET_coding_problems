package Problems;
//4

import java.util.*;

public class Practice {
	  
	public static void main(String[] args) {
		String s = "abccrrkarrlmmn";
        System.out.println(longestSubString(s));
    }
	
	public static String longestSubString(String s) {
		
	  HashMap<Character, Integer> map = new HashMap<>();
	  int start =  0;
	  int maxlen = 0;
	  int maxstart = 0;
	  int maxend = 0;
	  
	  for(int end  = 0 ; end<s.length(); end++) {
		  char ch = s.charAt(end);
		  if(map.containsKey(ch)) {
			  if(start<=map.get(ch)) {
				  start = map.get(ch)+1;
			  }
		  }
		  map.put(ch, end);
		  if (end - start + 1 >= maxlen) {
              maxlen = end - start + 1;
              maxstart = start;
              maxend = end;
             // //test 
          }
      }
      return "Length: " + maxlen + ", Substring: " + s.substring(maxstart, maxend + 1);
  }
	}
	
	
	
	
	
	
  


  
  





	

	
		


	


		
		
	


	
