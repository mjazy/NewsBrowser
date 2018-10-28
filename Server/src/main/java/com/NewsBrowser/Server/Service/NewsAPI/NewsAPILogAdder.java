package com.NewsBrowser.Server.Service.NewsAPI;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;

import com.NewsBrowser.Server.Service.Interfaces.LogAdderInterface;

public class NewsAPILogAdder implements LogAdderInterface{

	@Inject
	Logger logger;

	
	/**
	 * Should be used in case HTTP status 'TOO_MANY_REQUESTS' is returned.
	 */
	@Override
	public void addUnsuccessfulRequestDebugLog(ResponseEntity<String> responseEntity) {
		logger.debug("{} {}", responseEntity.getStatusCode(), responseEntity.getBody());		
	}

	
	/**
	 * Should be used in case HTTP status other than 'OK' or 'TOO_MANY_REQUESTS' is returned.
	 */
	@Override
	public void addUnsuccessfulRequestErrorLog(ResponseEntity<String> responseEntity) {
		logger.error("{} {}", responseEntity.getStatusCode(), responseEntity.getBody());
		
	}


	@Override
	public void addParsingExceptionErrorLog(String exceptionMessage) {
		logger.error("{} {}", "Parsing exception has occured:", exceptionMessage);
		
	}


}
