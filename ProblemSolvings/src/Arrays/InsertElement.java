package Arrays;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		
	int [] arr = new int[5]	;
	 arr[0] = 10;
     arr[1] = 20;
     arr[2] = 30;
     arr[3] = 40;
     
	
	
	
	int x = 10;
	
	int pos = 3;
	int index = pos-1;
	for(int i = arr.length ; i<index; i--) {
		
		
		arr[i+1] = arr[i]; 
//		i = pos-1;
//		arr[i] = x;
//		
//		break;
		
		
	}
    arr[index] = x;
	
	System.out.println(Arrays.toString(arr));
			
	}

}
