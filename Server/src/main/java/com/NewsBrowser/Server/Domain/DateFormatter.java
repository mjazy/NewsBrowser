package com.NewsBrowser.Server.Domain;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Domain service for date formatting.
 * @author MJazy
 *
 */
public class DateFormatter {
		
	
	/**
	 * Should be used to format date.
	 * @param format in which date should be returned e.g. 'yyyy-MM-dd'.
	 * @param date which should be formatted e.g. '10/27/2018'.
	 * @return formatted date as String.
	 */
	public String formatDate(String format, Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String formattedDate = dateFormat.format(date);
		return formattedDate;
	}

}
