package Problems;

import java.util.*;

public class Practice {
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' ||ch == 'i'||ch == 'o' ||ch == 'u' ;  
	}
	

	public static void main(String[] args){

	char ch = 'a';
	
	if(isVowel(ch)) {
		System.out.println("is an vowel");
	}
	else {
		System.out.println("is an consonont");
	}
     
	}
}
		
		
		
	


	
