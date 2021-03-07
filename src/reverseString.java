
public class reverseString {
	//Java Program to find Reverse of the string

	public static void main(String[] args) {
		String str="rahul";
		String t="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			t=t+str.charAt(i);
		}
		
		System.out.println(t);
	}
	
}
