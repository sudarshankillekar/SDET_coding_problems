package Strings;

public class Pangran {

	public static void main(String[] args) {		
		
		 String s  = "jumps over the lazy dobg";
		 String lowercasedS = s.toLowerCase();
		 
		 boolean pangram =  checkpangram(lowercasedS);
		 
		 if(pangram) {
			 System.out.println("is pangram");
		 }else {
			 System.out.println("not pangrame");
		 }
		 
		 }

		private static boolean checkpangram(String lowercasedS) {
			
			if(lowercasedS.length()<26) {
				return false;
			}
			
			for(char i = 'a' ;i<='z';i++) {
				if(lowercasedS.indexOf(i)<0) {
					return false;
				}
			}
			return true;
			
			
		}
	
}
