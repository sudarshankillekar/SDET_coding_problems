package Strings;

public class reverseAnStringBypreservingSpace {

	String name = "my name is sudarshan";
		
		int start = 0;
		int end = name.length()-1;
		
	   char chararray [] = name.toCharArray();
		
	   while(start<end) {
		   
		   if(chararray[start]==' ') {
			   start++;
			   continue;
		   }
		   else if(chararray[end]== ' ') {
		        end--;
		        continue;
		}
		   else {
			   char temp = chararray[start];
			   chararray[start]  = chararray[end];
			   chararray[end] = temp;
			   start++;
			   end--;
		   }
	   }
		
		System.out.println(new String(chararray));
		
	}

}
