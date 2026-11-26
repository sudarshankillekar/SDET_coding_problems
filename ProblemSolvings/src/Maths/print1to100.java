package Maths;

public class print1to100 {

	public static void print100(int n ) {
		if(n>100) {
		return;
		}
		System.out.println(n);
		print100(n+1);
		
	}

	
	public static void main(String[] args) {
		print100(1);
	}
	
//	 public static void print(int n) {
//	        if (n > 100) {
//	            return;
//	        }
//	        System.out.println(n);
//	        print(n + 1);
//	    }
//
//	    public static void main(String[] args) {
//	        print(1);
//	    }
}
