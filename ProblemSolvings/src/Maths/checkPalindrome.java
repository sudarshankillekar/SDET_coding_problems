package Maths;

public class checkPalindrome {

	public static void main(String[] args) {
	
       int n = 12112;
	int dup = n;	
		int revNum = 0;
		
		while(n>0) {
			
			int ld = n%10;
			
			revNum = (revNum*10)+ld;
			
		  n = n/10;
			
		}
		
		System.out.println(revNum);
		
		if(dup == revNum) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}

	}

}
