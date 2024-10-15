package logicalPrograms;

public class Reverse_Number_Using_String_Method {

	public static void main(String[] args) {
		
		int number=12345;
		String num=Integer.toString(number);
		String rev="";
		
		for(int i=num.length()-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}
		
		int IntegerNumber=Integer.parseInt(rev);
		System.out.println("Reverse of given number is : "+IntegerNumber);

	}

}
