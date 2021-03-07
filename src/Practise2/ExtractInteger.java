package Practise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractInteger {

	public static void main(String[] args) {
		
		String a="1abc35de 99fgh, dd11";
		
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(a);
		
		while(m.find())
		{
			System.out.print(m.group());
		}
	}

}
