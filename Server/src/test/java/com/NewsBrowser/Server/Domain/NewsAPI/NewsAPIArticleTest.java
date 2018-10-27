package com.NewsBrowser.Server.Domain.NewsAPI;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NewsAPIArticleTest {
	
	NewsAPIArticle newsAPIArticle;
	String newsAPIArticleToStringRelevantValue;
	
	@Before
	public void initializeNewsAPIArticle () {
		String testString = "test";
		NewsAPISource newsAPISource = new NewsAPISource(testString, testString);
		newsAPIArticle = new NewsAPIArticle(newsAPISource, testString, testString, testString, testString, testString, testString, testString);
		newsAPIArticleToStringRelevantValue =  String.format("source: '%s', author: '%s', title: '%s', description: '%s', url: '%s', urlToImage: '%s', publishedAt: '%s', content: '%s'", 
				newsAPISource.toString(), testString, testString, testString, testString, testString, testString, testString);
	}
	
	
	@Test
	public void toStringTest() {
		assertEquals(newsAPIArticleToStringRelevantValue, newsAPIArticle.toString());
	}


}
