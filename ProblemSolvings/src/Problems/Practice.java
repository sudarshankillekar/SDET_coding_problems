package Problems;

import java.util.*;

public class Practice {
	
	
	public static void main(String[] args){

		int [] a = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i <a.length ; i++) {
			for(int j = i+1 ; j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]+"is an duplicate element in an array");
				}
			}
		}
	
	}
}
		



		
		
		
		
	


	
