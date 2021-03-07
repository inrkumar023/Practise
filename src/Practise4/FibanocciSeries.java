package Practise4;

public class FibanocciSeries {

	public static void main(String[] args) {
		// 1,2,3,5,8,13,24,37
		
		int a=0;
		int b=1;
		
		int k = 1;
		
		while(k<9)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		
			k++;
		}

	}

}
