package logicalPrograms;

import java.util.Scanner;

public class ReverseNumberUsingInteger {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter any Number :-");
		int Num1=scn.nextInt();
		int Num2=0;
		
		for(int i=Num1;i>0;i=i/10)
		{
			int rem=i%10;
			Num2=Num2*10+rem;
		}
		
		System.out.println("Reverse the digits of given number is : "+Num2);
		
		if(Num2==Num1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not-Palindrome");
		}
			

}
}
