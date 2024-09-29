package Strings;

public class reverseSecondWordsInString {

	
	    public static void main(String[] args) {
	    	
	    	
	    	
	    	String s = "Sudarshan gopal killekar";
	    	
		     String[] l = s.split(" ");
		     
	    	StringBuilder sb = new StringBuilder(l[1]);
	    	
	    	 l[1] = sb.reverse().toString();
	  
	         String res =  String.join(" ", l);
	          
	         System.out.println(res);   	
	 
	         
	         
//	        String s = "Sudarshan gopal killekar";
//	        String[] l = s.split(" ");
//	        int i = 0;
//	        StringBuilder output = new StringBuilder();
//
//	        while (i < l.length) {
//	            if (i % 2 == 0) {
//	                output.append(l[i]);
//	            } else {
//	                output.append(new StringBuilder(l[i]).reverse().toString());
//	            }
//	            output.append(" ");
//	            i++;
//	        }
//
//	        // Trim the trailing space and print the result
//	        System.out.println(output.toString().trim());
//	    }
	}

}
