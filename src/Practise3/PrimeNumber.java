package Practise3;

public class PrimeNumber {

	public static void main(String[] args) {

               int val=10;
               boolean flag=false;
               
               for(int i=2;i<=val/2;i++)
               {
            	   if(val%2==0)
            	   {
            		   flag=true;
            		   break;
            	   }
               }
          if(flag)
          {
        	  System.out.println("Ginev number is not prime");
          }
          else
          {
        	  System.out.println("Ginev number is prime");
          }
	}

}
