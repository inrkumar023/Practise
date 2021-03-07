package Demo;

public class demo2 {

	public static void main(String[] args) {
		
		int[] a= {3,4,6,8,9,50};
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
System.out.println(max);
	}

}
