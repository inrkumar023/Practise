package Practise1;

public class SumElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		int sum=ArraySum(a);
		System.out.println(sum);
		

}

	private static int ArraySum(int[] a) {
		
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}

		return sum;
	}
}