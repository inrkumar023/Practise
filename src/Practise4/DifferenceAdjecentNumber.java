package Practise4;

public class DifferenceAdjecentNumber {

	public static void main(String[] args) {
	
		int[] a= {4,3,10,50,9,18};
		int diff = 0;
		
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
