package com.NewsBrowser.Server.Service.NewsAPI;

import javax.inject.Inject;
import javax.inject.Named;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.NewsBrowser.Server.Service.Interfaces.NewsFetcherInterface;

@Named
public class NewsAPINewsFetcher implements NewsFetcherInterface {
	
	@Inject
	RestTemplate restTemplate;	
	
	@Inject
	NewsAPILoggingValidator newsAPILoggingValidator;
	
	@Inject
	NewsAPILogAdder newsAPILogAdder;
	
	


	/**
	 * Related to creation of ResponseEntity.
	 */
	
	private HttpEntity<?> httpEntity(){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(httpHeaders);
	}
		
	
	@Override
	public String fetchNews(String url) {
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity(), String.class);
		
		if (newsAPILoggingValidator.shouldUnsuccessfulRequestDebugLogBeAdded(responseEntity) == true) {
			newsAPILogAdder.addUnsuccessfulRequestDebugLog(responseEntity);
		}
		else if (newsAPILoggingValidator.shouldUnsuccessfulRequestErrorLogBeAdded(responseEntity) == true) {
			newsAPILogAdder.addUnsuccessfulRequestErrorLog(responseEntity);
		}
		
		String responseBody = responseEntity.getBody();
		return responseBody;
	}
	
	
	

}
