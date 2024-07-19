package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		System.out.println(reverwords("I love Java programming. Java is fun and Java is powerful."));
	}
	
	
     static String reverwords(String s) {
		
	String [] words = s.split(" +");
	
	StringBuilder sb = new StringBuilder();
	
	for(int i = words.length-1 ;i>=0;i--) {
		sb.append(words[i]);
		sb.append(" ");
	}
	
	return sb.toString().trim();
        }
	
}

		
		
	


	
