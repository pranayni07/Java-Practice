package logicalPrograms;

public class Reverse_part_of_String {

	public static void main(String[] args) {
		
		String s="I am in Pune city";
		String s1="Pune";
		
		String ar[]= s.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i].equals(s1))
			{
					String temp=ar[i];
					String rev="";
					
				for(int j=temp.length()-1;j>=0;j--)
				{
					
					rev=rev+temp.charAt(j);
					ar[i]=rev;
				}
				
			}
			
			System.out.print(ar[i]+" ");
		}
		
	}

}
