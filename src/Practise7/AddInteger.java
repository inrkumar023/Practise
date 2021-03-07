package Practise7;

public class AddInteger {

	public static void main(String[] args) {
		
		int[] a= {5,10,15,20,25};
		int val=sumArray(a);
		System.out.println(val);
		

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
