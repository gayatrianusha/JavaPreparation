
public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		  //0 1 1 2 3 5 8 13
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++)
		{   
			
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			System.out.println();
		}
	}

}
