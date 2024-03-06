
public class Palindrome {

	public static void main(String[] args)
	{
	int org=101;
	int num=org;
	
	int rev=0;
	int add=0;
	
	
	
	while(num>0)
	{
		add=num%10;//101%10=1
		rev=rev*10+add;//1
		num=num/10;	//num=10
	}
	System.out.println(rev);
	
	if(rev==org)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
	
	}
}
