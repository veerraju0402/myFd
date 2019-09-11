package com.incture.utility;

import java.sql.Timestamp;
import java.util.Date;
import java.util.TimeZone;

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
	
	public static  boolean isEmptyDate(Date obj) {
		if (obj == null || obj.equals(null)) {
			return true;
		}
		return false;
	}
	
	public static  Date getTime() {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Date currentDate = timestamp;
		return currentDate;
	}
}
