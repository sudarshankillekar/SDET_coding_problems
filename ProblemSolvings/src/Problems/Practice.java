package Problems;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		//Added
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an name to check for palidrome");
		s = sc.nextLine();
		//S
		int i ,j ,flag = 0;
		i = 0; j = s.length()-1;
		
		while(i<j && flag == 0) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag = 1;
				break;
			}
			i++;
			j--;
		}
		if(flag == 0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
	
	}
	
}

	


		
		
	


	
