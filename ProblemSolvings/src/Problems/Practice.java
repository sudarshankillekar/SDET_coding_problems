package Problems;

import java.util.*;

public class Practice {
	
	static void logicForReversing(int [] arr ,int start , int end){

		while(start<end){

		int temp ;

	    temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		start++;
		end--;

		}
	}
		static void printarray(int [] arr,int size){

		for(int i = 0 ; i<size ; i++){
		 System.out.print(arr[i]+" ");
		 System.out.println(); 
		}

		}

		public static void main(String args[]){

		int [] arr = {1,2,3,4,5,6};
		printarray(arr,5);
		logicForReversing(arr,0,5);
		System.out.print("Reveresearray");
		printarray(arr,6);
		}

		}
		
		
		
		
	


	
