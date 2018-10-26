package com.NewsBrowser.Server.Service.NewsAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.NewsBrowser.Server.Service.Interfaces.LoggingValidatorInterface;


public class NewsAPILoggingValidator implements LoggingValidatorInterface {

	
	/**
	 * HTTP status possible to expect in case of NewsAPI is 'TOO_MANY_REQUESTS'.
	 */
	@Override
	public boolean shouldDebugLogBeAdded(ResponseEntity<String> responseEntity) {
		if (responseEntity.getStatusCode() == HttpStatus.TOO_MANY_REQUESTS) {
			return true;			
		}
		else {
			return false;
		}
	}

	/**
	 * Every status that is not 'OK' or 'TOO_MANY_REQUESTS' should be logged in case of NewsAPI.
	 */
	@Override
	public boolean shouldErrorLogBeAdded(ResponseEntity<String> responseEntity) {
		if (responseEntity.getStatusCode() !=  HttpStatus.OK && responseEntity.getStatusCode() != HttpStatus.TOO_MANY_REQUESTS) {
			return true;			
		}
		else {
			return false;
		}
	}

}
