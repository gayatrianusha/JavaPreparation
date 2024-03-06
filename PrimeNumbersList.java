import java.util.Scanner;

public class PrimeNumbersList {
	
	public static void main(String[] arg)
	{
		
		System.out.println("Prime Number from 1 to 100");
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
				
			}
			
			
			if(count==0)
			{
				System.out.println(i);
			}
			

			
			
		}
				
	}

}
