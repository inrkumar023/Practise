package sap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractInteger {

	public static void main(String[] args) {
		
		String str="rah1417hultest#$57,m kl";
		
		Pattern p= Pattern.compile("\\d");
		Matcher m= p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
