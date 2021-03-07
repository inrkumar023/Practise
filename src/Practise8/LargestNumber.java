package Practise8;

public class LargestNumber {

	public static void main(String[] args) {
		
		int[] a= {2,9,7,4,7,1,0,100};
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
