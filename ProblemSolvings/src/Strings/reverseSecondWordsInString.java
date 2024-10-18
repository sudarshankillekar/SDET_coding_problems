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
	         
	         
	         
	        
//	        	    public static void main(String[] args) {
//	        	        String input = "Hello World Java Programming";  // Example input string
//	        	        String[] words = input.split(" ");  // Step 1: Split the string into words
//
//	        	        if (words.length >= 2) {  // Step 2: Check if there are at least two words
//	        	            // Step 3: Reverse the second word manually
//	        	            String secondWord = words[1];
//	        	            String reversedWord = "";
//	        	            for (int i = secondWord.length() - 1; i >= 0; i--) {
//	        	                reversedWord += secondWord.charAt(i);
//	        	            }
//
//	        	            // Step 4: Rebuild the string with the reversed second word
//	        	            words[1] = reversedWord;
//	        	            String result = String.join(" ", words);
//
//	        	            // Output the result
//	        	            System.out.println(result);
//	        	        } else {
//	        	            System.out.println("The string doesn't have a second word.");
//	        	        }
//	        	    }
	        	}
        
	}


