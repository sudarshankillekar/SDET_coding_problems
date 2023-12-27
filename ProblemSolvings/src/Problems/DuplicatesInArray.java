package Problems;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		//int a[] = {2,3,4,3,5,1,2};
		int a[] = new int[7];		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter any 7 element");
		
		for (int i = 0 ; i<7 ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length;j++) {
				
				if(a[i] == a[j]) {
					
					System.out.println(a[i]+ " is an duplicte element");
				}
				
			}
		}
		

	}

}
