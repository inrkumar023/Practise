package Practise2;

public class Multiplication {

	public static void main(String[] args) {
		
		int result=Multiply(5,10);
		System.out.println(result);

	}

	private static int Multiply(int i, int j) {
                
		int k=1;
		int sum=0;
		
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}

		
		return sum;
	}

}
