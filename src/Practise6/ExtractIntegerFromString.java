package Practise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegerFromString {

	public static void main(String[] args) {
		
		String str="rahul1417";
		
	Pattern p=	Pattern.compile("\\d");
	Matcher m=p.matcher(str);
	
	while(m.find())
	{
		System.out.println(m.group());
	}

	}

}
