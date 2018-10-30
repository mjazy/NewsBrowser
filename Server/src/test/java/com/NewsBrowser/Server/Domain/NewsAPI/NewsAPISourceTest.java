package com.NewsBrowser.Server.Domain.NewsAPI;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPISource;

public class NewsAPISourceTest {

	NewsAPISource newsAPISource;
	
	@Before
	public void initializeVariable () {
		newsAPISource = new NewsAPISource("testId", "testName");
	}
	
	
	@Test
	public void toStringTest() {
		assertEquals("id: 'testId', name: 'testName'", newsAPISource.toString());
	}

}
