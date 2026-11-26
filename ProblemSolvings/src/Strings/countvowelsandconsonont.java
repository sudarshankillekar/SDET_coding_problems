package Strings;

public class countvowelsandconsonont {

	public countvowelsandconsonont() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
	
	String name = "Sudarshan is my name";
	
	 name =  name.toLowerCase();
	 
	 int vowels = 0;
	 int consononts  = 0;
	 
	 for(int i = 0 ;i<name.length();i++) {
		
		char ch  = name.charAt(i);
		
	   if(ch >= 'a' && ch<='z') {
		   
		   if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
			   vowels++;
		   }
		   else {
			   consononts++;
		   }
		   
		   
	   }
	 }
	 
		
		System.out.println("Consononts "+consononts+" "+vowels+" is vowels");
		
		
		
		
	}
	

}
