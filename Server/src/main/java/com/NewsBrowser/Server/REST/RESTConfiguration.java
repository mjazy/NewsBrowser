package com.NewsBrowser.Server.REST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.NewsBrowser.Server.Service.NewsAPINewsFetcher;
import com.NewsBrowser.Server.Service.NewsAPIValidator;

@Configuration
public class RESTConfiguration {
	
	@Bean
	NewsAPINewsFetcher newsAPINewsFetcher() {
		return new NewsAPINewsFetcher();
	}

	@Bean
	NewsAPIValidator newsAPIValidator() {
		return new NewsAPIValidator();
	}

}
