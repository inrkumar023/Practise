package Practise1;

public class FibanocciSeries {

	public static void main(String[] args) {


		int a=0;
		int b=1;
		int i=1;
		int sum;
		
		while(i<9)
		{
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
			i++;
		}

	}

}
