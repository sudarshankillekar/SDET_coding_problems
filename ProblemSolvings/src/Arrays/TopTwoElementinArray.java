package Arrays;

import java.util.Arrays;

public class TopTwoElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] IntegerArray = {90,2,5,20,56,100};
		
		int [] sortedArray = TopTwoElementinArray.getTopTwoElements(IntegerArray);
		TopTwoElementinArray.DisplayTopTwoElements(sortedArray);
	}
	    
		private static int[] getTopTwoElements(int[] IntegerArray) {
			
			int[] input = IntegerArray;
			int temp ;
			System.out.println("User Input");
			System.out.println(Arrays.toString(input));
			
			for(int i = 0; i < input.length; i++) {
				for(int j = 0 ; j< input.length;j++) {
				if(input[i]>input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}				
				}
			}
			return input;
			
		}
		private static void DisplayTopTwoElements (int[] sortedArray) {
			int [] array = sortedArray;
			System.out.println(Arrays.toString( array));
			System.out.println(( array[0]));
			System.out.println(( array[1]));
		}
		
	}


