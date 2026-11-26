package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class sortAnArray {

	public static void main(String[] args) {
   
		 //Using Streams	
		List<Integer>	value =	Arrays.asList(9,4,5,7,8);
		value.stream().sorted().forEach(s->System.out.print(s));	
		
		
	//using collections	
		List<Integer> li = Arrays.asList(2, 1, 3, 1, 3);
		Collections.sort(li);
		System.out.println(li); 
		
		
   //using  Treeset	
		TreeSet<Integer> t  = new TreeSet<>(Arrays.asList(2, 1, 3, 1, 3));
		System.out.println(t);
		
		
		
		
   //sorting using for loop
		int arr [] = {9,8,7,6,5,4};
		
		for(int i = 0 ;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
