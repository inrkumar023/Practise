package Practise8;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum;
		
		for(int i=0;i<=8;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
			
		}
		

	}

}
