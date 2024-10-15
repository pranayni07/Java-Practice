package logicalPrograms;

public class Shift_Zero_to_Left {

	public static void main(String[] args) {
		
		int ar[]= {6,4,2,0,6,5,3,0,5,9,5,6,0,0,3,0};
		int ar1[]=new int[ar.length];
		int index=0;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]==0)
			{
				index++;
			}
		}
		
		for(int j=0;j<=ar1.length-1;j++)
		{
			if(ar[j]!=0)
			{
				ar1[index]=ar[j];
				index++;
			}
			System.out.print(ar1[j]+" ");
		}
	}

}
