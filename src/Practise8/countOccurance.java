package Practise8;

public class countOccurance {

	public static void main(String[] args) {
		
	int count=	countOccurance("aaaaddfr",'d');
	System.out.println(count);

	}

	private static int countOccurance(String word, char character) {
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
