package misc1;

public class reversestring {

	public static void main(String[] args) {
		
		
		String str="rahul";
		String k="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			k=k+str.charAt(i);
		}
		System.out.println(k);
	}

}
