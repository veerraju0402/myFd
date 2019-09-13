package com.incture.utility;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		/*timestamp.setDate(03);
       	timestamp.setYear(118);
       	timestamp.setMonth(03);
       	timestamp.setHours(0);
       	timestamp.setMinutes(0);
       	timestamp.setSeconds(0);
       	timestamp.setNanos(0);*/
		Date currentDate = timestamp;
		return currentDate;
	}
	
	public static Date convertStringToDate(String stringDate){
		
		try {
			String sDate1=stringDate;  
		    Date date1;
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
			return date1;
		} catch (ParseException e) {
			System.err.println("Exception:-"+e.getMessage());
			return getTime();
		}      
	}  
	public static String convertDateToString(Date d){
		Date date = d; 
		System.out.println("date is-"+date);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = dateFormat.format(date); 
        System.err.println("String date is-"+strDate);
        return strDate;
	}
}
