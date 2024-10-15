package logicalPrograms;

public class Count_number_of_WhiteSpaces {

	public static void main(String[] args) {

		String s = "ui iu v u oho k";

		int count = 0;

		for (int i = 0; i <= s.length() - 1; i++) 
		{
			char temp = s.charAt(i);

			if (temp == (' ')) {
				count++;
		}

		}
		System.out.println("No. of WhiteSpaces are :" + count);

	}

}
