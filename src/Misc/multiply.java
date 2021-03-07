package Misc;

public class multiply {

	public static void main(String[] args) {
		
		int val= multiply(5,10);
		System.out.println(val);

	}

	private static int multiply(int i, int j) {
		
		
		int k=1;
		int sum = 0;
		
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
	}

}
