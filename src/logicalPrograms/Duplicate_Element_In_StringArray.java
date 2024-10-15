package logicalPrograms;

public class Duplicate_Element_In_StringArray {

	public static void main(String[] args) {
		String ar[]= {"ind","aus","ire","ind","wi","sa","aus"};
		int count=0;
		
		System.out.println("Duplicate strings are :");
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].equals(ar[j]))
				{
					System.out.print(ar[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of Duplicate strings are : "+count);

	}

}
