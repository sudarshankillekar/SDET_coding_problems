package Strings;

public class firstRepeatingCharacter {

	public firstRepeatingCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String name  = "Sudarshan";
		
		for(int i = 0;i<name.length();i++) {
			
		  for(int j = i+1; j<name.length();j++) {
               if(name.charAt(i)==name.charAt(j)) {
            	   
            	   System.out.println("is first repeating character "+name.charAt(i)); 
            	   return;
            	   
               }
		  }
		  
			
		}
		

	}

}
