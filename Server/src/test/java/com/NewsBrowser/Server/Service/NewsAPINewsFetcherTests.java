package com.NewsBrowser.Server.Service;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAPINewsFetcherTests {

	
	@Inject
	RestTemplate restTemplate;
	
	@Inject
	NewsAPINewsFetcher newsAPINewsFetcher;

	
	@Test
	public void succesfulFetchNewsTest() {
		String responseBody = newsAPINewsFetcher.fetchNews("pl", "technology");
		assertThat(responseBody, containsString("\"status\":\"ok\",\"totalResults\":20"));
	}
	
}
