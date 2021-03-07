package Practise4;

import java.util.ArrayList;

public class UniqeInteger {

	public static void main(String[] args) {
		
		int[] a= {2,1,2,1,3,9,0,7,9};
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
