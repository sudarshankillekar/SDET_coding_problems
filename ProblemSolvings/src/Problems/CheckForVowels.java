package Problems;
import java.util.*;

public class CheckForVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ;
		System.out.println("enter any character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(ch=='a'|| ch == 'e'||ch =='i'|| ch =='o'|| ch =='u')
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonent");
		}

	}

}
