package Practise7;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=13;
		boolean flag=false;
		
		for(int i=0;i<=a;i++) {
			if(a%2==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}

}
