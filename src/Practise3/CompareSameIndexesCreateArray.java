package Practise3;

import java.util.ArrayList;

public class CompareSameIndexesCreateArray {

	public static void main(String[] args) {
		
		int[] a= {2,4,6,8,10};
		int[] b= {1,4,7,8,10};
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
         Object[] c=  al.toArray();
         for(Object ob : c) {
        	 System.out.println(ob);
         }
         
	}

}
