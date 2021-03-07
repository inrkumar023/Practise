package misc1;

public class prime {

	public static void main(String[] args) {
		
		int a=11;
		boolean flag=false;
		
		for(int i=0;i<=11;i++)
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
