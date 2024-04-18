package Problems;
import java.util.Scanner;
public class findTheLargestElementIntheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5];
		int max;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter any 5 element");
		
		for (int i = 0 ; i<5 ; i++) {
			a[i] = sc.nextInt();
		}
		
		max = a[0];
		
		for (int i = 1; i<5; i++) {
			if(a[i] > max) {
				
				max = a[i];
			}
			
		}
		System.out.println(max+ "Is the largest element in the array");
		int min = a[0];	
		
		for (int i = 1; i<5; i++) {
			if(a[i] < min) {
				
				max = a[i];
			}
					
		}
		System.out.println(min+ " Is the smallest element in the array");
	}

}
