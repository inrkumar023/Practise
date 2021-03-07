package misc1;

import java.util.ArrayList;

public class uniqeArray {

	public static void main(String[] args) {
		
		
		int[] a= {1,1,2,2,3,3,4,4,5,5};
		ArrayList<Integer> al =new ArrayList<Integer>();
		
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
