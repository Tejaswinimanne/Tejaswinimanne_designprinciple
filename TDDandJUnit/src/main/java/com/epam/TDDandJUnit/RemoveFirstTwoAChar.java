package com.epam.TDDandJUnit;

public class RemoveFirstTwoAChar {
	public String remove(String string) {
		int len = string.length();
		String str = "";
		
		if(len==1 && string.charAt(0)!='A')
			str=string;
		
		else if(len == 2) {
			
			if(string.charAt(0)!='A'  && string.charAt(1)!='A')
				str=string;
			
			else if(string.charAt(0)!='A'  && string.charAt(1)=='A')
				str += string.charAt(0);
			
			else if(string.charAt(0)=='A'  && string.charAt(1)!='A')
				str +=string.charAt(1);

		}
		else if(len > 2) {
			
			String temp = string.substring(2,len);
			
			if(string.charAt(0)=='A'&& string.charAt(1)=='A')
				str=temp;
			
			else if(string.charAt(0)=='A'  && string.charAt(1)!='A')
				str += string.charAt(1)+temp;
			
			else if(string.charAt(0)!='A'  && string.charAt(1)=='A') 
				str += string.charAt(0)+temp;
			
			else str=string;
		}
		
		return str;
	}
}
