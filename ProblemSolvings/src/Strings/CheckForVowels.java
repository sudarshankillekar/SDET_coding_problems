package Strings;
import java.util.*;
//4
public class CheckForVowels {
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);		
		return ch =='a'|| ch == 'e'||ch =='i'|| ch =='o'|| ch =='u';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ;
		System.out.println("enter any character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(isVowel(ch))
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+" is consonent");
		}      
		
	}
}
