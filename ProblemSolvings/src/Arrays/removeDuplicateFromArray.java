package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateFromArray {

	public removeDuplicateFromArray() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args) {
		
	int []  num = {1,3,4,5,2,1,4};	
		
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	
	for(Integer uni : num) {
		
		set.add(uni);
		
	}
	
	System.out.println(set);
		
		
	}
	
	
	
	
	

}
