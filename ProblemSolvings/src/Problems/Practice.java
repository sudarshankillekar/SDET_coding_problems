package Problems;

import java.util.*;

public class Practice {
	
	static boolean checkForanargram(String s1 , String s2) {
		
		String Str1 = s1.replaceAll("//s", "");
		String Str2 = s2.replaceAll("//s", "");
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			char c1[] = Str1.toLowerCase().toCharArray();
			char c2[] = Str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2); 
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(checkForanargram("sudarshan", "darshanaa"));
	}
	
	
}
		



		
		
		
		
	


	
