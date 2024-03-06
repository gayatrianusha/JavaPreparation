
public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find occurence of character in word or sentence
		
		String a="aaaahjhjjjjjaahjasajjjjjjajjjjjjajjjjaoojo";
		char ch='a';
		int count=0;
		
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
