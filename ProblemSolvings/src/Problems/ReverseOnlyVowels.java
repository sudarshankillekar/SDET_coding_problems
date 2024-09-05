package Problems;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
	
		String input = "holle";
		String vowels ="aeiouAEIOU";
		char  [] inputarray = input.toCharArray();
		
		int left = 0;
		int right = inputarray.length-1;
		
		while(left<right) {
			if(vowels.indexOf(inputarray[left]) == -1) {
				left++;
			}
			else if(vowels.indexOf(inputarray[right]) == -1) {
				right--;
			}
			
			else {
				char temp ;
				temp = inputarray[left];
				inputarray[left] = inputarray[right];
				inputarray[right] = temp;
				left++;
				right--;
			}
		}
		
		System.out.println("output " + new String(inputarray));

	}

}
