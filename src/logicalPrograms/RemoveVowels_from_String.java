package logicalPrograms;

public class RemoveVowels_from_String {

	public static void main(String[] args) {
		
		String s1="Apple";
		String s2=s1.toLowerCase();
		String s3="";
		int count = 0;
		
		for(int i = 0;i<=s2.length()-1;i++)
		{
			char temp=s2.charAt(i);
			if(temp!='a'&& temp!='e'&& temp!='i'&& temp!='o'&& temp!='u')
			{
				s3=s3+temp;
			}
			else
			{
				count++;
			}
		}
		System.out.println(s3);
		System.out.println("Number of vowels are: "+count);
	}
	
}
