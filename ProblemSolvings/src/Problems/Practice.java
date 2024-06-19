package Problems;

import java.util.*;

public class Practice {

	
	

		public static void main (String[] args){

		int a[] = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any 7 digits");

		for(int i =0;i<7;i++){
		a[i] = sc.nextInt();
		}

		for(int i = 0;i<a.length;i++){
		   for(int j = i+1;j<a.length;j++){
		     if(a[i] == a[j] ){
		     System.out.println(a[i]+" is an duplicate element");
		}
		}
		
		}

		}
}

