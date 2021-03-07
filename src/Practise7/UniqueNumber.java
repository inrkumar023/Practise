package Practise7;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		
		int[] a= {2,4,4,5,6,7,7,8,9,9};
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
