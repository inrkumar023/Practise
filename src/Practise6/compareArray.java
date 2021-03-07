package Practise6;

import java.util.ArrayList;

public class compareArray {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,7};
		int[] b= {2,4,4,6,6,8};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
			
		}
		//System.out.println(al);
		
		Object[] c=al.toArray();
		
		for(Object ob : c)
		{
			System.out.println(ob);
		}
	}

}
