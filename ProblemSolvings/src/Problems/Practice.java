package Problems;
//4

import java.util.*;

public class Practice {
		
  
		   
	public static void printpairSum(int [] arr ,int sum ,int size) {
		
		for(int i = 0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println("("+arr[i]+" "+arr[j]+")");
				}
			}
		}
		
		
		
	}
	 public static void main(String[] args) {
	     
		   int [] arr = {1,23,24,4,2,3,2};
		   int sum = 5;
		   int size = arr.length;
		   printpairSum(arr,sum,size);
		  
		   }  
	   
	   
	   
   }


  


  
  





	

	
		


	


		
		
	


	
