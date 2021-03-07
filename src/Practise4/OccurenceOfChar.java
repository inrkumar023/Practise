package Practise4;

public class OccurenceOfChar {

	public static void main(String[] args) {
		
		int count=countOccurance("aaadkkla",'k');
		System.out.println(count);

	}

	private static int countOccurance(String word, char character) {
		int count=0;
		for(int i=0;i<word.length();i++) {
		
			if(word.charAt(i)==character)
			{
				count++;
			}
		
		
		}
		
		
		
		return count;
	}

}
