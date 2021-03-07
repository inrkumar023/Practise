package Practise1;

import java.util.ArrayList;

public class UniqeInteger {

	public static void main(String[] args) {
		
		int[] a= {1,3,2,4,3,1,5,5,6,9,8,10};
		ArrayList<Integer> unique=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!unique.contains(a[i]))
			{
				unique.add(a[i]);
			}
			
		}
		
		System.out.println(unique);

	}

}
