package Maths;

public class reverseDigitsOfNumber {

	public static void main(String[] args) {
	
		int n = 12345;
		
		int revNum = 0;
		
		while(n>0) {
			
			int ld = n%10;
			
			revNum = (revNum*10)+ld;
			
		  n = n/10;
			
		}
		
		System.out.println(revNum);

	}

}
