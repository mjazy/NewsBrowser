package com.NewsBrowser.Server.Domain.NewsAPI;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIArticle;
import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPISource;

public class NewsAPIArticleTest {
	
	NewsAPIArticle newsAPIArticle;
	String newsAPIArticleToStringRelevantValue;
	
	@Before
	public void initializeVariables () {
		String testString = "test";
		Date testDate = new Date();
		NewsAPISource newsAPISource = new NewsAPISource(testString, testString);
		newsAPIArticle = new NewsAPIArticle(newsAPISource, testString, testString, testString, testString, testString, testDate, testString);
		newsAPIArticleToStringRelevantValue =  String.format("source: '%s', author: '%s', title: '%s', description: '%s', url: '%s', urlToImage: '%s', publishedAt: '%s', content: '%s'", 
				newsAPISource.toString(), testString, testString, testString, testString, testString, testDate, testString);
	}
	
	
	@Test
	public void toStringTest() {
		assertEquals(newsAPIArticleToStringRelevantValue, newsAPIArticle.toString());
	}


}
