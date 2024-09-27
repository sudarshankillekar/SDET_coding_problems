//test
package Arrays;
import java.util.ArrayList;
import java.util.List;
//4
public class intersectionOfSortedArray {
	
	public static void main(String[] args){
		
		 int arr1[] = {2, 2, 2, 3, 3, 4, 7, 8};
		 int arr2[] = {1, 2, 4, 4, 6, 6, 6, 7, 8, 10};
		 
		 List<Integer> intersection = new ArrayList<>();
		 intersectionOfArray(arr1,arr2,intersection);
		 System.out.println(intersection);
		
	}

	static void intersectionOfArray(int [] arr1 ,int[] arr2 ,List<Integer>IntersectedList) {
	
	int i = 0;
	int j = 0;
	
		
   while(i < arr1.length && j <arr2.length) {
   	//Skip duplicate elements in the array , if the element is duplicate then increment it by i++
   	while ((i < arr1.length-1) && (arr1[i] == arr1[i+1])) {
   		i++;
   		
   	}
   	//Skip duplicate elements in the array , if the element is duplicate then increment it by j++
   	while ((j < arr2.length-1) && (arr2[j] == arr2[j+1])) {
   		j++;
   		
   	}
   	
   	//if arr1 is less then arr2 , then increment it by i++
   	if(arr1[i]<arr2[j]) {
   		i++;	
   	} 

	//if arr1 is less then arr2 , then increment it by i++	
   	else if  (arr1[i]>arr2[j]) {
   		j++;	
   	}

	//then store all the intersection of element in arr1	
   	else {
   		IntersectedList.add(arr1[i]);
   		i++;
   		j++;
   	}
   }
		
		
	}
		
		
	
	
	
}
