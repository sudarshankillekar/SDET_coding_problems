package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args){

		String s  = "dad";

		int i ,j ,flag = 0;

		i = 0;
		j = s.length()-1;

		while(i<j&&flag == 0){
		if(s.charAt(i)!=s.charAt(j))
		flag = 1;
		break;
		}

		if(flag == 0)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
		}
	}


	
