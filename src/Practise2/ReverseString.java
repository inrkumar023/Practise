package Practise2;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="rahul";
		String k="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			k=k+a.charAt(i);
		}
		
System.out.println(k);
	}

}
