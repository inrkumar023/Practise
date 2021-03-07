package Practise8;

public class maxDiffe {

	public static void main(String[] args) {
		
		int[] a= {4,15,16,20,32,35};
		int diff=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i+1]-a[i]>diff)
				{
					diff=a[i+1]-a[i];
				}
				
			}
			
			
		}
System.out.println(diff);
	}

}
