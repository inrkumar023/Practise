package Misc;

public class MaxAdjecentdiff {

	public static void main(String[] args) {
		
		
		int[] a= {11,3,5,10,11,13};
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
