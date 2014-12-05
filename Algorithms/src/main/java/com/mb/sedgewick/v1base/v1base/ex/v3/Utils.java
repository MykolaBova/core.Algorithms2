package com.mb.sedgewick.v1base.v1base.ex.v3;

public class Utils {

	public static boolean isInteger(String s) {
		try { 
			Integer.parseInt(s); 
		} catch(NumberFormatException e) { 
			return false; 
		}
		// only got here if we didn't return false
		return true;
	}
	
}