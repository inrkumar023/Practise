package Practise8;

import java.util.ArrayList;

public class uniqueInteger {

	public static void main(String[] args) {
	
		int[] a= {1,4,1,4,6,6,8,9,9,4,8};
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
