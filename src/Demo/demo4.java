package Demo;

import java.util.ArrayList;

public class demo4 {
	
	
	
			
			public static  int[] sortedArray(int[] a,int[] b) {
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		
		Object[] ob=al.toArray();
		
		for(Object c : ob)
		{
			System.out.println(c);
		}
		
		//c=[9,8,7,6,5]
		
		
		for(int i=0;i<c.length;c++)
			int temp;
		{
			
			for(int j=1+i;j<c.length;c++)
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
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c);
		}
	
	}

	public static void main(String[] args) {
		
		static ArrayList<Integer> al=new ArrayList<Integer>();
		int val = sortedArray(a,b) 
	}

}
