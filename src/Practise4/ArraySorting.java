package Practise4;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] a= {3,9,1,5,2,7,0};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
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
