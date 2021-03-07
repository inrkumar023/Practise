package Practise3;

public class FibanocciSeries {

	public static void main(String[] args) {
		// 1,2,3,5,8,13,21,34
		//
		
		int a=0;
		int b=1;
		int i=1;
		int sum=0;
		
		while(i<9) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);				
		   i++;
		}

	}

}
