package Problems;

public class reverseSecondWordsInString {

	
	    public static void main(String[] args) {
	        String s = "sudarshan sangeeta";
	        String[] l = s.split(" ");
	        int i = 0;
	        StringBuilder output = new StringBuilder();

	        while (i < l.length) {
	            if (i % 2 == 0) {
	                output.append(l[i]);
	            } else {
	                output.append(new StringBuilder(l[i]).reverse().toString());
	            }
	            output.append(" ");
	            i++;
	        }

	        // Trim the trailing space and print the result
	        System.out.println(output.toString().trim());
	    }
	}


