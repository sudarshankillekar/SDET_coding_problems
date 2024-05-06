package Problems;
import java.util.ArrayList;
import java.util.List;

public class intersectionOfSortedArray {
	
	public static void main(String[] args) {
		
		    int arr1[] = {2, 2, 2, 3, 3, 4, 7, 8};
		    int arr2[] = {1, 2, 4, 4, 6, 6, 6, 7, 8, 10};
		    List<Integer> finalIntersection = new ArrayList<>();
		    findIntersection(arr1, arr2,finalIntersection);
		    System.out.println(finalIntersection);
	}

	static void findIntersection(int[] arr1,int[] arr2, List<Integer>FinalList) {
		int i =0;
		int j = 0;
		
		while(i<arr1.length && j<arr2.length) {
			
			while((i<arr1.length-1) && (arr1[i] ==arr1[i+1])) {
				i++;
			}
			
			while((j<arr1.length-1) && (arr1[j] ==arr1[j+1])) {
				j++;
			}
			
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else {
				FinalList.add(arr1[i]);
				i++;
				j++;
			}
		
		}
		
	}
	
	
	
}
