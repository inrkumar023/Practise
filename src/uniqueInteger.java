import java.util.ArrayList;

public class uniqueInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] ar= {1,2,3,1,2,3,4,5,9,4,5,9,7,8,6,7,9,8};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(!al.contains(ar[i]))
			{
				al.add(ar[i]);
			}
		}
		System.out.println(al);
	}

}
