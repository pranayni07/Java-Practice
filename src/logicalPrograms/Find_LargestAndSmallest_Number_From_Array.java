package logicalPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class Find_LargestAndSmallest_Number_From_Array {

	public static void main(String[] args) {
		
		int ar[]= {12,21,45,55,50,90,64,37,18,5};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			ts.add(ar[i]);
		}
		
		System.out.println(ts);
		
		ArrayList<Integer> al=new ArrayList<Integer>(ts);
		System.out.println("Smallest Number is "+al.get(0));
		System.out.println("Largest Number is "+al.get(al.size()-1));

		

	}

}
