package Problems;

public class primenumber {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		
		if(num>1) {
			
		for(int i = 1; i<=num ;i++) {
			
			if(num%i==0) 
				count++;
		}
		if(count == 2) {
			System.out.println("is a prime number");
		}
		else {
			System.out.println("not an prime number");
		}			
		}
		else {
			System.out.println("Not an prime number");
		}
//tesr
	}

}
