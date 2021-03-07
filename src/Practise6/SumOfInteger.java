package Practise6;

public class SumOfInteger {

	public static void main(String[] args) {
		
		
		int[] a= {2,4,6,8,10};
		
		int sum=SumArray(a);
		System.out.println(sum);

	}

	private static int SumArray(int[] a) {

		int sum=0;
          for(int i=0;i<a.length;i++)
          {
        	  sum=sum+a[i];
          }
		
		return sum;
	}

}
