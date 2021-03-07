package misc1;

public class OccuranceString {

	public static void main(String[] args) {
		
		int val= occurance("aaaardkgjj",'a');
		System.out.println(val);

	}

	private static int occurance(String word, char character) {
		int count=0;
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}
		
		return count;
	}

}
