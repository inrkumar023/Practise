package sap;

import java.util.ArrayList;

public class UniqueInteger {

	public static void main(String[] args) {
		
		int[] a= {2,4,6,4,2,1,0,6};
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
