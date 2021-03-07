package Misc;

public class numberofoccurence {

	public static void main(String[] args) {
		
	int count=	OccuranceCount("aaagdh",'h');
	System.out.println(count);

	}

	private static int OccuranceCount(String word, char character) {
		
		int count = 0;
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
