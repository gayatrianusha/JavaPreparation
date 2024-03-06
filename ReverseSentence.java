
public class ReverseSentence {

	public static void main(String[] args)

{
	
		String sente="I love mom";
		 String rev="";
		String[] words=sente.split(" ");
		
			for(int j=words.length-1;j>=0;j--)
			{
				rev=rev+words[j];
				rev=rev+" ";
			}
		
		
		System.out.println(rev);
}
}
