package com.NewsBrowser.Server.Domain.NewsAPI;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIArticle;
import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIFetchNewsResponse;
import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPISource;

public class NewsAPIFetchNewsResponseTest {

	
	NewsAPIFetchNewsResponse newsAPIFetchNewsResponse;
	String newsAPIFetchNewsResponseToStringRelevantValue;
	
	
	@Before
	public void initializeVariables() {
	String testString = "test";
	Date testDate = new Date();
	NewsAPISource newsAPISource = new NewsAPISource(testString, testString);	
	List<NewsAPIArticle> newsAPIArticles = new LinkedList<NewsAPIArticle>();
	NewsAPIArticle newsAPIArticle = new NewsAPIArticle(newsAPISource, testString, testString, testString, testString, testString, testDate, testString);
	newsAPIArticles.add(newsAPIArticle);
	newsAPIArticles.add(newsAPIArticle);
	newsAPIFetchNewsResponse = new NewsAPIFetchNewsResponse(testString, testString, newsAPIArticles);
	newsAPIFetchNewsResponseToStringRelevantValue = String.format("status: '%s', totalResults: '%s', articles: '%s'", testString, testString, newsAPIArticles.toString());
	};
	
	@Test
	public void toStringTest() {
		assertEquals(newsAPIFetchNewsResponseToStringRelevantValue, newsAPIFetchNewsResponse.toString());
	}

}
