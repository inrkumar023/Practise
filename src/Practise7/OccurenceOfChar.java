package Practise7;

public class OccurenceOfChar {

	public static void main(String[] args) {
		
	int count=	countOccurence("aaaddee",'a');
	System.out.println(count);

	}

	private static int countOccurence(String string, char character) {
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)==character)
			{
				
				count++;
			}
		}
		
		return count;
	}

}
