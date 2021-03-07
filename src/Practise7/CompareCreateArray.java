package Practise7;

import java.util.ArrayList;

public class CompareCreateArray {

	public static void main(String[] args) {
		
		int[] a= {2,4,6,5,7,9};
		int[] b= {2,5,6,7,7,8,0,5,1};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
        Object[] ob=al.toArray();
        for(Object c :ob)
        {
        	System.out.println(c);
        }
	}

}
