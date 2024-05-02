package Problems;

public class reversestring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sudarshan is a boy";
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
		}
		System.out.println(rstr);
	}

}
