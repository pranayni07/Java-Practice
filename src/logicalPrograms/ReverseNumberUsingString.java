package logicalPrograms;

import java.util.Scanner;

public class ReverseNumberUsingString {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		int Num1=scn.nextInt();
		
		String s=Integer.toString(Num1);
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		
		int revNum=Integer.parseInt(temp);
		
		System.out.println("Reverse the digits of given number is : "+revNum);
		
	}

}
