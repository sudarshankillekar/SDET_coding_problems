package Problems;

import java.util.*;

public class Practice {
	
	
	
	 static int [] twosum (int [] num,int target) {
	
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 for(int i = 0 ; i<num.length;i++) {
			 int requ_num = target- num[i];
			 if(map.containsKey(requ_num)) {
				 int [] arr = {map.get(requ_num),i};
				 return arr;
 			 }
			 map.put(num[i], i);
		 }
	return null ;
		 
	}
	
	
	public static void main(String[] args) {
		
		
	int [] num = {3,3}; 	
    System.out.println(Arrays.toString(twosum(num, 6)));
  
		
		
	}
	
}
   
	


		
		
	


	
