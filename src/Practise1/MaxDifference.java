package Practise1;
 //maximum difference between any adjacent index

public class MaxDifference {
	

	public static void main(String[] args) {

                int[] ar= {1,4,8,15,17}; //3,12,13,10,19
                int diff=0;
                
                for(int i=0;i<ar.length-1;i++)
                {
                	if(ar[i+1]-ar[i]>diff)
                	{
                		diff=ar[i+1]-ar[i];
                	}
                }
                System.out.println(diff);

	}
	

}
