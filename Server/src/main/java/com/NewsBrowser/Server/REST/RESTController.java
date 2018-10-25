package com.NewsBrowser.Server.REST;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewsBrowser.Server.Service.NewsAPINewsFetcher;
import com.NewsBrowser.Server.Service.NewsAPIValidator;

@RestController
public class RESTController {
	
	@Inject
	NewsAPIValidator newsAPIValidator;
	
	@Inject
	NewsAPINewsFetcher newsAPINewsFetcher;
	
	
	// Mock-up version allowing basic functionality.
	@RequestMapping("/")
	String getRequest() {
		
		String response = null;
		
		if (newsAPIValidator.isInputValid("pl", "technology")) {
			response = newsAPINewsFetcher.fetchNews("pl", "technology");			
		}
		else {
			response = "{ \"error\" : \"Invalid request parameter(s)\" }";
		}
		return response;
	}
	

}
