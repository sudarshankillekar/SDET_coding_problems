package Arrays;

public class checkForElementInArray {
	
	public static void main(String[] args) {
		String s = "dad";
//
		int i ,j,flag = 0;
		i = 0;
		j = s.length()-1;

		while(i<j && flag == 0){
		if(s.charAt(i)!=s.charAt(j)){
		flag = 1;
		break;
		}
		i++;
		i--;
		}

		if(flag == 0)
		System.out.println("is palindrome");
		else
		System.out.println("Not palindrome");
		
	}
}
