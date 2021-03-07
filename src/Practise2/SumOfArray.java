package Practise2;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] ar= {2,4,6,8,10};
		
		    int sum=ArreySum(ar);
		    System.out.println(sum);


	}

	private static int ArreySum(int[] ar) {
             int sum = 0;
             for(int i=0;i<ar.length;i++)
             {
            	 sum=sum+ar[i];
             }
			return sum;
	}

}
