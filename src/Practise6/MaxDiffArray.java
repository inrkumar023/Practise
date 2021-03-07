package Practise6;

public class MaxDiffArray {

	public static void main(String[] args) {
		
		int[] a= {10,5,7,14,22,25};
		int diff = 0;
		
		
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