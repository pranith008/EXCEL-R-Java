package day3;

public class Firstnonrepeatingcharinstring {

	public static void main(String[] args) {
		String name = "abbcad";

		for (int i = 0; i < name.length(); i++) // i ch
		{ // 0 a if(0==4) false
			char ch = name.charAt(i); // 1 b if(1==2) false
			if (name.indexOf(ch) == name.lastIndexOf(ch)) // 2 b if(1==2) false
			{ // 3 c if(3==3) true
				System.out.println(ch);
				return;
			}
		}

	}

}
