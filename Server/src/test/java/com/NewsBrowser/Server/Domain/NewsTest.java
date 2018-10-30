package com.NewsBrowser.Server.Domain;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIArticle;
import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPISource;

public class NewsTest {

	
	News news;
	String newsToStringRelevantValue;
	
	@Before
	public void initializeVariables() {
		String testString = "test";
		Date testDate = new Date();
		NewsAPISource newsAPISource = new NewsAPISource(testString, testString);
		NewsAPIArticle newsAPIArticle = new NewsAPIArticle(newsAPISource, testString, testString, testString, testString, testString, testDate, testString);
		
		List<NewsAPIArticle> newsAPIArticles = new LinkedList<>();
		newsAPIArticles.add(newsAPIArticle);
		newsAPIArticles.add(newsAPIArticle);
		
		List<RequirementsCompliantArticle> requirementsCompliantArticles = newsAPIArticles.stream().map(article -> new RequirementsCompliantArticle(article)).collect(Collectors.toList());
		
		news = new News(testString, testString, newsAPIArticles);
		newsToStringRelevantValue = String.format("country: '%s', category: '%s', articles: '%s'", testString, testString, requirementsCompliantArticles.toString());
	}
	
	@Test
	public void toStringTest() {
		assertEquals(newsToStringRelevantValue, news.toString());
	}

}
