package Strings;

import java.util.ArrayList;
import java.util.List;

public class reverseWordsinString {
 //3  
//Alternate method	
//	String str =  " sudarshan is name my ";
//	   String [] splitedString = str.split(" ");
//	   List<String> reversedlist = new ArrayList<>();
//		for( int i=splitedString.length-1;i >= 0;i--) {
//			reversedlist.add(splitedString[i]);
//	        
//		}
//		
//		
//		  String reversedString = String.join(" ", reversedlist);
//	        System.out.println(reversedString.trim());
//		
// }
	
	
	
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
