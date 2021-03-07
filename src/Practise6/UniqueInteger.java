package Practise6;

import java.util.ArrayList;

public class UniqueInteger {

	public static void main(String[] args) {
		
		int[] a= {2,3,2,3,4,5,5,6,7,7};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
			}
		}
System.out.println(al);
	}

}
