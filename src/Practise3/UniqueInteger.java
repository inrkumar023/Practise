package Practise3;

import java.util.ArrayList;

public class UniqueInteger {

	public static void main(String[] args) {
		
		int[] a= {1,4,2,4,3,1,5,7,5,7};
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
