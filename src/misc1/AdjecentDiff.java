package misc1;

public class AdjecentDiff {

	public static void main(String[] args) {
		
		int[] a= {2,5,9,10,18,50,20};
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
