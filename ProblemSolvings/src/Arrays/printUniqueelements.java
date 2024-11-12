package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printUniqueelements {

	public static void main(String[] args) {
		
	
		
	  List<Integer> values	=   Arrays.asList(1,2,2,4,9,3,3,1,2);
		
	  values.stream().distinct().forEach(s->System.out.print(s));

	}

}
