package Arrays;

import java.util.Arrays;

public class MoveZeroesToLeft {

// int arr[] = {1,0,2,0,2,3,0,1,9,7};
	
// 	List<Integer> arrlist = new ArrayList<>();
	
// 	int count = 0 ;
// 	for(int i = 0 ;i<arr.length;i++) {
		
// 		if(arr[i] == 0) {
// 			arrlist.add(arr[i]);
// 		}
// 		count++;
// 	}
	
// 	//System.out.println(arrlist);
	
// 	List<Integer> arrlist1 = new ArrayList<>();
// 	int count2 = 0 ;
// 	for(int i = 0;i<arr.length;i++) {
	
// 		if(arr[i] != 0) {
// 			arrlist1.add(arr[i]);
// 		}
// 		count2++;
		
// 	}
 //	arrlist.addAll(arrlist1);
// 	arrlist1.addAll(arrlist);
// 	System.out.println(arrlist);
// 	System.out.println(arrlist1);
	
	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,0,1};
		
		
		int j = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
     	
		for(int i = j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
		      int temp = arr[i];
		      arr[i] = arr[j];
		      arr[j] = temp;
		      j++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		 
	}

}
