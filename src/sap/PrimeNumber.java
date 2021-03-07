package sap;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=11;
		boolean flag=false;
		
		for(int i=2;i<=a;i++)
		{
		   if(a%2==0)
		   {
			   flag=true;
			   break;
		   }
		}
		if(flag)
		{
			System.out.println("given number is not prime");
		}
		else
		{
			System.out.println("given number is prime");
		}
	}
	
}