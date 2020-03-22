package com.mycompany.tddjunit;

public class RemoveAChar {
  
	public String remove(String s) {
		int l=s.length();
		
		if(s.charAt(0)=='A' && s.charAt(1)!='A') {
			return s.substring(1,l);
		} else if(s.charAt(0)=='A' && s.charAt(1)=='A') {
			return s.substring(2,l);
		} else if(s.charAt(1)=='A' && s.charAt(0)!='A') {
			return s.charAt(0)+s.substring(2,l);
		} else {
		return s;
		}	
	}
}
