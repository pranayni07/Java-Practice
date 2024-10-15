package logicalPrograms;

import java.util.Scanner;

public class Count_number_of_Char_Occurance_In_String {

	public static void main(String[] args) {
		String s="RADAR";
		
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			if(temp=='R')
			{
				count++;
			}
		}
		
		System.out.println("Occurance of R in given string is : " +count);

	}

}
