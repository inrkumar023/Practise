

//Java Program to count the total number of characters in a string
public class countString {

	public static void main(String[] args) {
		
        String a="abcgdab c dabcd";
        
        int count=0;
        
        for(int i=0;i<a.length();i++) {
        	
        	if(a.charAt(i)!=' ')
        	{
        		count=count+1;
        	}
        	
        }
		System.out.println(count);

}
}