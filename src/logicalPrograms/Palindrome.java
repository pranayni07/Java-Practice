package logicalPrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter your String :-");
		String s=obj.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) //length()---starts counting from 1
		{
			rev = rev+s.charAt(i);
		}
		
		System.out.println("Original string is "+s);
		System.out.println("Reverse string is "+rev); 
		
		if(s.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not-palindrome");

	}

}
