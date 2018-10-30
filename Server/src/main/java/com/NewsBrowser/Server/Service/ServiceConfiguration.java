package com.NewsBrowser.Server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPILogAdder;
import com.NewsBrowser.Server.Service.NewsAPI.NewsAPILoggingValidator;

/**
 * Configuration file that includes beans used by different services.
 * @author MJazy
 *
 */

@Configuration
public class ServiceConfiguration {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
		
	@Bean
	@Scope("prototype")
	Logger logger(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
	}
	
	@Bean
	NewsAPILoggingValidator newsAPILoggingValidator() {
		return new NewsAPILoggingValidator();
	}
	
	@Bean
	NewsAPILogAdder newsAPILogAdder() {
		return new NewsAPILogAdder();
	}	
}
