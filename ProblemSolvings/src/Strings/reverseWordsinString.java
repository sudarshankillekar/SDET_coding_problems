package Strings;

import java.util.ArrayList;
import java.util.List;

public class reverseWordsinString {
String test = "Hey man whats up";
		
		String test1[] =  test.split(" ");
		

        int start = 0;
        int end = test1.length-1;
        while(start<end) {
        	
        	String temp = test1[start];
        	test1[start] = test1[end];
        	test1[end] = temp;
         	start++;
        	end--;
        }
        
        String reversedStringe = String.join(" ",test1);
        
        System.out.println(reversedStringe);
        
        }
	
	
	
	public static void main(String[] Args ) {
		
	 System.out.println(reverseWords("  the sky  is blue  "));	
	}
	
	static String reverseWords(String s) {
		
		String[] Words = s.split(" +");
		StringBuilder sb = new StringBuilder();
        
		for(int i  = Words.length-1; i>=0;i--) {
			sb.append(Words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
}
