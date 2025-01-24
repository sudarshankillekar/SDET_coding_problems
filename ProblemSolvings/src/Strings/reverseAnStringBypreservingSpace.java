package Strings;

public class reverseAnStringBypreservingSpace {

	public static void main(String[] args) {
	
	String word = "i love my india";
	
	//a idni ym
	
	char [] c1 = word.toCharArray();
	char [] c2 = new char[c1.length];
	
	for(int i = 0 ;i<c1.length;i++) {
		
		if(c1[i] == ' ') {
			
			c2[i] = ' ';
			
		}
		
	}
	
	
	int j = c2.length-1;
	
	for(int i = 0 ;i<c1.length;i++) {
		
		if(c1[i]!= ' ') {
			
			while(c2[j] == ' ') {
			j--;
			}
			c2[j]=c1[i];
			j--;
		}
		
	
	}
	
		System.out.println(String.valueOf(c2));

	}

}
