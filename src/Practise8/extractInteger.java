package Practise8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractInteger {

	public static void main(String[] args) {
		
		String str = "1417rahul007";
		
		Pattern p= Pattern.compile("\\d");
		Matcher m= p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
