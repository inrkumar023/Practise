package Practise7;

public class MaxDifference {

	public static void main(String[] args) {
		
		int[] a= {50,6,14,25,19,16};
		int diff=0;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i+1]-a[i]>diff)
			{
				diff=a[i+1]-a[i];
			}
			
		}
		System.out.println(diff);
	}

}
