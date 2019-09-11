package com.incture.utility;

public class StringUtils {

	
	public static  boolean isEmpty(String str) {
		if (str == null || str.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	public static  boolean isEmptyObject(Object obj) {
		if (obj == null || obj.equals(null)) {
			return true;
		}
		return false;
	}
}
