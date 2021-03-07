package Practise8;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] a= {9,8,7,6,3,2,10,1,5,4};
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
		}
	}

}
