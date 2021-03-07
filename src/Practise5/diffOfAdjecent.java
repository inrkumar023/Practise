package Practise5;

public class diffOfAdjecent {

	public static void main(String[] args) {
		
		int[] a= {4,9,10,3,0,50};
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
