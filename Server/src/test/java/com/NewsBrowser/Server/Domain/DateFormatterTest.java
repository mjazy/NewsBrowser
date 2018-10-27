package com.NewsBrowser.Server.Domain;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class DateFormatterTest {

	
	Date date;
	String expectedDateString;
	DateFormatter dateFormatter;
	
	@Before
	public void initializeVariables(){
		Calendar calendar = new GregorianCalendar(2018, Calendar.OCTOBER, 27);
		date = calendar.getTime();
		expectedDateString = "2018-10-27";
		dateFormatter = new DateFormatter();
	}
	
	
	@Test
	public void dateFormatterTest() {
		assertEquals(expectedDateString, dateFormatter.formatDate("yyyy-MM-dd", date));
	}

}
