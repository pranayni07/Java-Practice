package logicalPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number=153;
		int sum = 0;
		
		for(int i=number;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==number)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
		{
			System.out.println("Given number is Not Armstrong number");
		}
	}

}
