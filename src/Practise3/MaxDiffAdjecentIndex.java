package Practise3;

public class MaxDiffAdjecentIndex {

	public static void main(String[] args) {
		
		int[] a= {2,5,4,9,8,17,20};
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
