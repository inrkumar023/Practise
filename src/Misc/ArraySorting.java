package Misc;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] a= {9,8,7,6,5,4,3,2,1,0};
		int temp;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j])
				{
					//swap
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
