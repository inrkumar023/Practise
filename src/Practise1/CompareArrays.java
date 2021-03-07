package Practise1;

import java.util.ArrayList;

//compare same indexs of 2 diff array and create new array

public class CompareArrays {

	public static void main(String[] args) {


		int[] a= {2,4,6,8,10};
		int[] b= {1,4,5,8,10};
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				ar.add(a[i]);
			}
			
		}
		Object[] c=ar.toArray();
		for(Object ob : c) {
			System.out.println(ob);
			
		}
		

	}

}
