package logicalPrograms;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		PatternProgram obj=new PatternProgram();
		
		System.out.println("Enter row and column for pattern 1");
		obj.pattern1(scn.nextInt(),scn.nextInt());
		
		System.out.println("Enter row and column for pattern 2");
		obj.pattern2(scn.nextInt(),scn.nextInt());

	}
	
	public void pattern1(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==j)
				System.out.print(1);
				else
				System.out.print(0);
			}
			
			System.out.println();
		}
	}
	
	public void pattern2(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j==1||j==col)
				System.out.print(i);
				else
				System.out.print(0);
			}
			
			System.out.println();
		}
	}
	
	
	
}
