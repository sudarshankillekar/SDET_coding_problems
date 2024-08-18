package Problems;
//4

import java.util.*;

public class Practice {
	   
  public static void main(String[] args) {
	
	  fibologic(9);
	  
  }
  
  
  static void fibologic(int n) {
	  
	  int num1 = 0;
	  int num2 =1;
	  
	  for(int i = 0;i<n;i++) {
		  int num3 = num1+num2;
		  System.out.print(num1+" ");
		  num1 = num2;
		  num2 = num3;
	  }
	  
	  
  }
  
  
  
  
}
  
  


  
  





	

	
		


	


		
		
	


	
