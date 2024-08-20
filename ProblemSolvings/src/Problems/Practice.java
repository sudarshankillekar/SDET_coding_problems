package Problems;
//4

import java.util.*;

public class Practice {
	   
   public static void main(String[] args) {
	
	   String s  = "abcmmnqnq";
	   System.out.println(LongestSubString(s));
   
}
   
   
   
   static String LongestSubString(String s) {
	   int start = 0;
	   int maxStart = 0;
	   int maxLen = 0;
	   int maxend = 0;
	   
	   HashMap <Character,Integer> map = new HashMap<>();
	   
	   for(int end = 0;end<s.length();end++) {
		   char c  = s.charAt(end);
		   if(map.containsKey(c)) {
			   if(start<=map.get(c)) {
				   start = map.get(c)+1;
			   }
		   }
		   map.put(c, end);
	   
	   
	   if(end-start+1 >= maxLen) {
		   maxLen = end-start+1;
		   maxStart = start;
		   maxend = end;
	   }
	   	   
	   }
	   
	   return "maxLength "+maxLen+"subString "+s.substring(maxStart,maxend+1);
	   
	   
   }
	
	
}
  

  
  


  
  





	

	
		


	


		
		
	


	
