package Strings;

public class printFirstnonRepeatingcharacter {

	public printFirstnonRepeatingcharacter() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
     String str = "hello";
     
	 int[] freq = new int[256];
	 
	 
	 for(char ch : str.toCharArray()) {
		 freq[ch]++;
	 }
	 
	 for(char ch : str.toCharArray()) {
		 if(freq[ch]==1)
		 System.out.println(ch);
		 return;
	 }
	
		
		
	}

}
