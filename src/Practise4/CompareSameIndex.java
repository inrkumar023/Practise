package Practise4;

import java.util.ArrayList;

public class CompareSameIndex {

	public static void main(String[] args) {

          int[] a= {3,5,7,9,11};
          int[] b= {1,5,7,11,11};
          ArrayList<Integer> al = new ArrayList<Integer>();
          
          
          
          for(int i=0;i<a.length;i++) {
        	  
			if(a[i]==b[i])
        	  {
        		  al.add(a[i]);
        	  }
          }
         Object[] c=   al.toArray();
         for(Object ob : c)
         {
        	 System.out.println(ob);
         }
	}

}
