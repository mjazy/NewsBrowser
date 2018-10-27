package com.NewsBrowser.Server.Domain;

import static org.junit.Assert.*;

import java.util.Date;


import org.junit.Before;
import org.junit.Test;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIArticle;
import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPISource;
import com.NewsBrowser.Server.Domain.RequirementsCompliantArticleTest;

public class RequirementsCompliantArticleTest {

	
	RequirementsCompliantArticle requirementsCompliantArticle;
	String requirementsCompliantArticleToStringRelevantValue;
	
	@Before
	public void initializeVariables() {
		String testString = "test";
		Date testDate = new Date();
		DateFormatter dateFormatter = new DateFormatter();
		String formattedTestDateString = dateFormatter.formatDate("yyyy-MM-dd", testDate);
		NewsAPISource newsAPISource = new NewsAPISource(testString, testString);
		NewsAPIArticle newsAPIArticle = new NewsAPIArticle(newsAPISource, testString, testString, testString, testString, testString, testDate, testString);
		requirementsCompliantArticle = new RequirementsCompliantArticle(newsAPIArticle);
		
		
		requirementsCompliantArticleToStringRelevantValue = String.format("author: '%s', title: '%s', description: '%s', date:'%s', sourceName: '%s', articleUrl: '%s', imageUrl: '%s'",
				testString, testString, testString, formattedTestDateString, testString, testString, testString);
	}

	
	@Test
	public void toStringTest() {
		assertEquals(requirementsCompliantArticleToStringRelevantValue, requirementsCompliantArticle.toString());
	}
}
