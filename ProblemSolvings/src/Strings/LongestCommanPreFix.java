package Strings;

import java.util.Arrays;

public class LongestCommanPreFix {

	public static void main(String[] args) {
		String[]	strs = {"flower","flow","flight"};
		
		
		
		System.out.println(prefix(strs));
		
	}

	public static String prefix(String[] str) {
		
		Arrays.sort(str);
		
		int index = 0;
		String s1 =  str[0];
		String s2 =  str[str.length-1];
		
		Arrays.sort(str);
		
		
		while(index<s1.length()) {
			if(s1.charAt(index)==s2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		
		return index == 0?"":s1.substring(0,index);
		
	}
	
	
}
