
public class PalindromeProgram {

	public static void main(String[] args) {


		String p="madam";
		String k="";
		
		for(int i=p.length()-1;i>=0;i--)
		{
			k=k+p.charAt(i);
			
		}
		System.out.println(k);

		if(k==p)
		{
			System.out.println("Given String is Palindrome");
		}
		/*else
		{
			System.out.println("Given String is not Palindrome");
		}*/
	}

}
