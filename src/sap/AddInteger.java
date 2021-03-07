package sap;

public class AddInteger {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
	int sum=	sumArray(a);
	System.out.println(sum);

	}

	private static int sumArray(int[] a) {
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
