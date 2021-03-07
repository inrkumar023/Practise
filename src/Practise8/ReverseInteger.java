package Practise8;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int a= 5431;
		int digit;
		
		int reverse=0;
		
		while(a!=0)
		{
			digit=a%10;
			reverse=digit+reverse*10;
			a=a/10;
		}
		System.out.println(reverse);
	}

}
