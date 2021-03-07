package Practise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegerFromString {

	public static void main(String[] args) {


		String str="dsdas,123,dwd,dsad0d sdjdsa";
		
		Pattern p=Pattern.compile("\\d");
		Matcher m=p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
