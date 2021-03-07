package Practise1;

public class ArraySorting {

	public static void main(String[] args) {


		int[] a= {4,2,6,5,9,1,10};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
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
