
public class ReverseWords {
	
	public static void main(String[] args)
	{
		String sentence="Hello my name is Gayatri";
		String[] words=sentence.split(" ");
		String rev="";
		//words[0]=Hello, words[1]=my,words[2]=name,words[3]=is,words[4]=Gayatri
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				rev=rev+words[i].charAt(j);
				
			}
			rev=rev+" ";
		}
		
		System.out.println(rev);
		
	}

}
