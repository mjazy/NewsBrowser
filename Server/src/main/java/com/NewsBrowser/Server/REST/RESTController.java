package com.NewsBrowser.Server.REST;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPINewsFetcher;
import com.NewsBrowser.Server.Service.NewsAPI.NewsAPIUserInputValidator;

@RestController
public class RESTController {
	
	@Inject
	NewsAPIUserInputValidator newsAPIValidator;
	
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
