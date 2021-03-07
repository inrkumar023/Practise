package Practise8;

import java.util.ArrayList;

public class compareCreateArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] b= {0,2,0,4,0,6,0,8,0,10};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
Object[] ob=al.toArray();

for(Object c: ob)
{
	System.out.println(c);
}
	}

}
