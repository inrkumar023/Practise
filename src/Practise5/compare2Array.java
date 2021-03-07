package Practise5;

import java.util.ArrayList;

public class compare2Array {

	public static void main(String[] args) {
		
		int[] a= {1,5,7,2,3};
		int[] b= {2,5,8,2,3};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		Object[] c=	al.toArray();
		for(Object ob : c)
		{
			System.out.println(ob);
		}

	}

}
