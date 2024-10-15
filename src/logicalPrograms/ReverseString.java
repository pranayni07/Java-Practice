package logicalPrograms;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter any word :");
		String s1=scn.next();
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println("Reverse of given word is : "+s2);
		
		if(s1.equals(s2))
			System.out.println("follow Palindrome");
		else
			System.out.println("Not follow Plindrome");
		
	}

}
