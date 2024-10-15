package logicalPrograms;

public class Duplicate_Element_In_IntegerArray {

	public static void main(String[] args) {
		int ar[]= {1,6,3,6,5,5,0,1,7,9,2,9,3};
		int count=0;
		
		System.out.println("Duplicate elements are :");
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of Duplicate elements are : "+count);

	}

}
