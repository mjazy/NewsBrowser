package com.NewsBrowser.Server.REST;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewsBrowser.Server.Service.NewsAPINewsFetcher;

@RestController
public class RESTController {
	
	@Inject
	NewsAPINewsFetcher newsAPINewsFetcher;
	
	
	// Mock-up version allowing basic functionality.
	@RequestMapping("/")
	String getRequest() {
		String response = newsAPINewsFetcher.fetchNews("pl", "technology");
		return response;
	}

}
