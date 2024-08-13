package Problems;
//3

import java.util.*;

public class Practice {
	
	   
  public static void main(String[] args) {
   
	String s = "abcyhcabiojiijfugygg"  ;
	System.out.println(lenghtOfLongestSubstring(s));	  
  }
  
  
  static String lenghtOfLongestSubstring(String s) {
	  
	  HashMap<Character,Integer> map = new HashMap<>();
	  
	  int start = 0;
	  int maxstart = 0;
	  int maxLen = 0 ;
	  int maxend = 0;
	  
	  for(int end = 0 ; end<s.length(); end++) {
	  
	  char c = s.charAt(end);
	  
	  if(map.containsKey(c)) {
		  if(start <= map.get(c)) {
			  start = map.get(c)+1;
		  }
	  }
	  map.put(c, end);
	  
	  if(end-start+1 >= maxLen) {
		maxLen =  end-start+1; 
		maxstart = start;
		maxend = end;
	  }
	  
	  }
	  
	  return "lenght"+maxLen+", Substring :"+ s.substring(maxstart,maxend+1);
	  
  }	  
	  
  }
  
  
  
  
  
  
  
  





	

	
		


	


		
		
	


	
