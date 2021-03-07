package sap;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] a= {10,5,2,4,15,11};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			System.out.println(a[i]);
		}

	}

}
