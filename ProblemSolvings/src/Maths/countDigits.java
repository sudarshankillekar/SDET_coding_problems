package Maths;


public class countDigits {

	public static void main(String[] args) {
		
		int n = 123456791;
	  System.out.println(countdigit(n));
	}
	
	
	static int countdigit(int num) {
		
	int	count = 0;
	
	while(num>0) {
		
	count++;
	
	num = num/10;
		
		
	}
	
	return count;
		
	}
	
	

}
