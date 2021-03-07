package misc1;

import java.util.ArrayList;

public class comparecreate {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5,6};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
           Object[] ob=al.toArray();
           for(Object c : ob)
           {
        	   System.out.println(c);
           }
	}

}
