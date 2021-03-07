package Practise3;

public class ArraySorting {

	public static void main(String[] args) {


		int[] a= {2,4,1,6,9,17};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					//swap
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
