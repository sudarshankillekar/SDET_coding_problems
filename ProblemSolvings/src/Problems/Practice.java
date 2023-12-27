package Problems;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		String str  = "Sudarshan";
		String Rstr = " ";
		char ch;
		
		for(int i = 0 ; i < str.length(); i++) {
			ch = str.charAt(i);
			Rstr = ch + Rstr ; 
		}
		System.out.println(Rstr);
		
	}
        }
		

