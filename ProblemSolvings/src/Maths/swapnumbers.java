package Maths;

public class swapnumbers {
//XOR cancels duplications 
	public static void main(String[] args) {
		
	
	int a = 102;
	int b = 20;
	
//	a = a^b;
//	b = a^b;
//	a=a^b;
	
	a = a + b;  // a = 30
    b = a - b;  // b = 10
    a = a - b;
	
	System.out.println(a);
	System.out.println(b);
	}
}
