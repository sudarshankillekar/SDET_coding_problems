package Strings;

public class validparanthesis {

	 public static void main(String[] args) {
			
		 
			String name = "{[()]}"; 
		    System.out.println(isValid(name));
			
			
			}
			
		 
		    public static boolean isValid(String a) {
		    	
		    	
		      char[] stack =     new char[a.length()];   
		      int top = -1;
		      
		      
		      for(char s : a.toCharArray()) {
		    	  if(s=='{') stack[++top]='}'; 
		    	  else if(s == '[') stack[++top]=']'; 
		    	  else if(s == '(') stack[++top]=')'; 
		    	  else if (top == -1 || stack[top--]!=s) return false;
		      }
		    	return top==-1;
		    }
		 
		 
		 
		 
		}	


