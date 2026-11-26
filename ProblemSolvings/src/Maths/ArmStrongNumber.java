package Maths;

public class ArmStrongNumber {

	public static void main(String[] args) {
		//
		int number = 153;
		int original = number;
		int sum = 0;

		while (number > 0) {
		    int digit = number % 10;       // Get the last digit
		    sum = sum + (digit * digit * digit);
		    number = number / 10;           // Remove the last digit
		}

		if (sum == original) {
		    System.out.println("Armstrong number");
		} else {
		    System.out.println("Not an Armstrong number");
		}
	}
//
}
