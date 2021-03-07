package Practise5;

public class Multiplication {

	public static void main(String[] args) {


		int val=multiply(5,10);
		System.out.println(val);

	}

	private static int multiply(int i, int j) {
		
		int sum=0;
		int k=1;
		
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
	}

}
