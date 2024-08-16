package Problems;
//

import java.util.*;

public class Practice {
	
	
	
static boolean Isvowel(char ch) {
		ch = Character.toLowerCase(ch);
	return ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u';	
}
	
	
	   
  public static void main(String[] args) {

	char ch ;
	System.out.println("enter an character to check for vowel");
	Scanner sc = new Scanner(System.in);
	
	ch = sc.next().charAt(0);
	
	if(Isvowel(ch)) {
		System.out.println(ch+"is an vowel");
	}else
		System.out.println(ch+" is an Consonant");	  
	  }
	  
  

  

  
  
  
  
  
  
	  
  
}

  
  


  
  
  
  
  





	

	
		


	


		
		
	


	
