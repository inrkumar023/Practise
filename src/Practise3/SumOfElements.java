package Practise3;

public class SumOfElements {

	public static void main(String[] args) {


		int[] a= {4,9,10,5,2,1};
		int sum=SumOfArray(a);
		System.out.println(sum);

	}

	private static int SumOfArray(int[] a) {
               
	           	int sum=0;
               for(int i=0;i<a.length;i++)
               {
            	   sum=sum+a[i];
               }
		
		return sum;
	}

}
