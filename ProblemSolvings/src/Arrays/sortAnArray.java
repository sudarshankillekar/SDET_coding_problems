package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortAnArray {

	public static void main(String[] args) {
   
		List<Integer>	value =	Arrays.asList(9,4,5,7,8);
		value.stream().sorted().forEach(s->System.out.print(s));
		
	}

}
