package Practise7;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] a= {11,4,8,9,10,3,21,1};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
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
