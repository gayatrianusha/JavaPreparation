
public class FindNumber {

	public static void main(String[] args)
	{
		
		String a="1223js89088fhjs";
		char[] ch=a.toCharArray();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(a.charAt(i)))
			{
				count++;
			}
				
		}
		
		System.out.println("Digits in String:"+count);
	}
}
