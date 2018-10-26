package com.NewsBrowser.Server.REST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPINewsFetcher;
import com.NewsBrowser.Server.Service.NewsAPI.NewsAPIUserInputValidator;

@Configuration
public class RESTConfiguration {
	
	@Bean
	NewsAPINewsFetcher newsAPINewsFetcher() {
		return new NewsAPINewsFetcher();
	}

	@Bean
	NewsAPIUserInputValidator newsAPIValidator() {
		return new NewsAPIUserInputValidator();
	}

}
