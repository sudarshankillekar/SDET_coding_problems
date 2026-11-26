package Arrays;

public class findCommonElementinArray {

	public findCommonElementinArray() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		int arr1 [] = {1,2,3,4,5};
		int arr2 [] = {23,22,23,2,1};
		
		for(int i = 0 ;i<arr1.length;i++) {
			
		for(int j = 0 ;j<arr2.length;j++) {
			
			if(arr1[i]== arr2[j]) {
				
				System.out.println(arr1[i]+"  is an comman element");
				break;
				
			}
			
			
		}
			
			
		}
		
		
	}

}
