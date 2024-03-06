import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int count=0;
		int a=sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count<2)
		{
			System.out.println("Prime Number");
		}else
		{
			System.out.println("Not a prime number");
		}
	}
}
