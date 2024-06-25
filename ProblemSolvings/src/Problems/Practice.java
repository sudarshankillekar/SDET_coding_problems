package Problems;

import java.util.*;

public class Practice {
		
		public static void main(String[] args){

			System.out.println(reverse(" the sky  is blue  "));

			} 

			static String reverse(String s){

			String [] words = s.split(" +");
			StringBuilder sb  = new StringBuilder();

			for(int i = words.length-1; i>=0;i--){

			sb.append(words[i]);
			sb.append(" ");

			}
			return sb.toString().trim();
			}
		
}
