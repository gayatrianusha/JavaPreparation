import java.util.Arrays;
import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		String fi=word.toLowerCase();
		char[] arr=fi.toCharArray();
		
		for(int i=0;i<fi.length();i++)
		{
if( fi.charAt(i)=='a'||fi.charAt(i)=='e'||fi.charAt(i)=='i'||fi.charAt(i)=='o'||fi.charAt(i)=='u')
{
	arr[i]='*';
}
			
		}
		
		for(int i=0;i<fi.length();i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
