package Problems;

public class checkForElementInArray {
	
	public static void main(String[] args) {
		int a []  = {20,120,10,1000,20};
		
		int compare_element = 10;
		boolean flag = false;
		
		for(int i = 0;i < a.length;i++) {
			if(compare_element == a[i]) {
				System.out.println("element is at index "+i+" for "+compare_element);
				flag = true;
				break;
			
			}
		}
		if(flag == false) {
			System.out.println("element is not present");
		}
	}
	
	
	
	

}
