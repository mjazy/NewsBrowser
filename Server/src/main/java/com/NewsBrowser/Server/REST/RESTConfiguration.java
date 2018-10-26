package com.NewsBrowser.Server.REST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPINewsFetcher;
import com.NewsBrowser.Server.Service.NewsAPI.NewsAPIURLPreparator;
import com.NewsBrowser.Server.Service.NewsAPI.NewsAPIUserInputValidator;

@Configuration
public class RESTConfiguration {
	
	@Bean
	NewsAPINewsFetcher newsAPINewsFetcher() {
		return new NewsAPINewsFetcher();
	}
	
	@Bean
	NewsAPIURLPreparator newsAPIURLPreparator() {
		return new NewsAPIURLPreparator("dc98f2c2ddfe44d0b8102025c394cd08");
	}

	@Bean
	NewsAPIUserInputValidator newsAPIValidator() {
		return new NewsAPIUserInputValidator();
	}

}
