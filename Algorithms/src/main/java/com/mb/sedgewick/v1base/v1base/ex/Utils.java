package com.mb.sedgewick.v1base.v1base.ex;

import java.util.ArrayList;
import java.util.List;

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
	
	public static boolean isDouble(String s) {
		try { 
			Double.parseDouble(s); 
		} catch(NumberFormatException e) { 
			return false; 
		}
		// only got here if we didn't return false
		return true;
	}

    public static List arayToList(int[] array) {
        List<Integer> items = new ArrayList<Integer>();
        for (Integer item : array) {
            items.add(item);
        }
        return items;
    }
}