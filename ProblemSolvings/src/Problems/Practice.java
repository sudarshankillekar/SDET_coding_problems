package Problems;
//3

import java.util.*;

public class Practice {
	
	   
  public static void main(String[] args) {

	int n  = 150;
	int temp = n ;
	int rem ,sum = 0;
	
	while(n>0) {
		rem = n%10;
		sum = (rem*rem*rem)+sum;
		n = n/10;
	}
	
	if(temp == sum) {
		System.out.println(temp+" is an armstrong number");
	}
	else {
		System.out.println(temp+" is not an armstrong number");
	}
	
	}
}	

	
	
	

	
		


	


		
		
	


	
