package sap;

public class DifferenceAdjecentArray {

	public static void main(String[] args) {
		
		int[] a= {3,7,6,20,15,10,50,100};
		int diff=0;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i+1]-a[i]>diff)
			{
				diff=a[i+1]-a[i];
			}
		}
System.out.println(diff);
	}

}
