package PatternsProblem;

public class Trianglewithtar {

//	    Outer loop (for (int i = 0; i < 5; i++)):
//		This loop runs from i = 0 to i = 4 (5 iterations). It controls the number of lines printed.
//
//		Inner loop (for (int j = 0; j <= i; j++)):
//		For each iteration of the outer loop, the inner loop runs from j = 0 to j = i. This loop controls how many * characters are printed on each line.
//
//		Iteration-by-Iteration Breakdown:
//		1. First Iteration of the Outer Loop (i = 0):
//		Inner Loop:
//		j = 0 (only one iteration because j <= i means j <= 0).
//		Prints *.
//		After the inner loop, a newline (System.out.println()) is printed.
//		Output:
//
//		markdown
//		Copy code
//		*
//		2. Second Iteration of the Outer Loop (i = 1):
//		Inner Loop:
//		j = 0: Prints *.
//		j = 1: Prints *.
//		After the inner loop, a newline is printed.
//		Output:
//
//		markdown
//		Copy code
//		*
//		**
//		3. Third Iteration of the Outer Loop (i = 2):
//		Inner Loop:
//		j = 0: Prints *.
//		j = 1: Prints *.
//		j = 2: Prints *.
//		After the inner loop, a newline is printed.
//		Output:
//
//		markdown
//		Copy code
//		*
//		**
//		***
//		4. Fourth Iteration of the Outer Loop (i = 3):
//		Inner Loop:
//		j = 0: Prints *.
//		j = 1: Prints *.
//		j = 2: Prints *.
//		j = 3: Prints *.
//		After the inner loop, a newline is printed.
//		Output:
//
//		markdown
//		Copy code
//		*
//		**
//		***
//		****
//		5. Fifth Iteration of the Outer Loop (i = 4):
//		Inner Loop:
//		j = 0: Prints *.
//		j = 1: Prints *.
//		j = 2: Prints *.
//		j = 3: Prints *.
//		j = 4: Prints *.
//		After the inner loop, a newline is printed.
//		Final Output:
//
//		markdown
//		Copy code
//		*
//		**
//		***
//		****
//		*****
	
	
	public static void main(String[] args) {
		
		
	for(int i = 0;i<5;i++) {
		
		for(int j = 0 ; j<=i;j++ ) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
	}
		

	}

}
