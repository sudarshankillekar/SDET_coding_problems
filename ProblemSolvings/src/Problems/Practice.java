package Problems;

import java.util.*;

public class Practice {

	
		public static void main(String[] args) {
			
			String str = "sudarshan";
			String rstr = " ";
			char ch ;
			
			for(int i = 0 ; i<str.length();i++) {
				ch = str.charAt(i);
				rstr = ch+rstr ;
			}
			
			System.out.println(rstr);
			
			
			
		}

}
		

