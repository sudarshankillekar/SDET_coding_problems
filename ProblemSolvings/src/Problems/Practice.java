package Problems;
//4

import java.util.*;

public class Practice {
	   
   public static void main(String[] args) {
	
   String  s = "sudarshan killekar";
   
   String [] s1 = s.split(" ");
   
   StringBuilder sb = new StringBuilder();
   
   int i = 0;
   
   while(i<s1.length) {
	   if(i%2 == 0) {
		   sb.append(s1[i]);
	   }
	   else
	   {
		   sb.append(new StringBuilder(s1[i]).reverse().toString());	   
   }
   sb.append(" ");
   i++;
   }

   System.out.println(sb.toString().trim());
   	   
}
}
  
  


  
  





	

	
		


	


		
		
	


	
