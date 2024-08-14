package Problems;

public class reverseWordsinString {
 //3   
	public static void main(String[] Args ) {
		
	 System.out.println(reverseWords("  the sky  is blue  "));	
	}
	
	static String reverseWords(String s) {
		
		String[] Words = s.split(" +");
		StringBuilder sb = new StringBuilder();
        
		for(int i  = Words.length-1; i>=0;i--) {
			sb.append(Words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
}
