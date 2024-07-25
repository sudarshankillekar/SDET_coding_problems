package Problems;

public class Fibonacciseries {

	
	static void fibonacilogic (int N) {
		
		int num1 = 0;  int num2 = 1;
		
		for (int i = 0 ; i < N;i++) {			
			int num3 = num1+num2;			
			System.out.print(num1+ " ");			
			num1 = num2;
			num2 = num3;			
		}		
	}
		//test
	public static void main(String[] args) {
	
	int	N = 10;
	
	fibonacilogic(N);
		
	}

}
