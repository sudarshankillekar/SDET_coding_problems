package Strings;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
	 String s  = "Sudarshan@!@#A$$h%^&*(info)(*&tech";
	 
	String S = s.replaceAll("[^a-zA-Z]","" );
	 
	System.out.println(S); 	
		
	}

}
