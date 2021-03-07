package Practise6;

public class Fibanocci {

	public static void main(String[] args) {
		// 1,2,3,5,8,13,24,37
		
		int a=0;
		int b=1;
		int sum;
		int i =1;
		
		while(i<9)
		{
			sum=a+b;
			a=b;
			b=sum;
			
			
			System.out.println(sum);
			
			i++;
		}
		

	}

}
