
public class MaximumNumber {
	
	public static void main(String[] args)
	{
		
		int a[]= {1,2,23989,12,368722,42,3,87};
		
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}
