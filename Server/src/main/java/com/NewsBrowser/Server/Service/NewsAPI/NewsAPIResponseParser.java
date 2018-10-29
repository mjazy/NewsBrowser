package com.NewsBrowser.Server.Service.NewsAPI;

import java.io.IOException;

import javax.inject.Inject;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIFetchNewsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Parsing service for NewsAPI vendor.
 * @author MJazy
 *
 */
public class NewsAPIResponseParser {
	
	@Inject
	NewsAPILogAdder newsAPILogAdder;
	
	private ObjectMapper objectMapper;
	
	public NewsAPIResponseParser() {
		objectMapper = new ObjectMapper();
	}
	
	/**
	 * Method used to parse response body related to NewsAPINewsFetcher service.
	 * @param fetchNewsResponseBody 
	 * @return response body parsed to NewsAPIFetchNewsResponse or null in case of exception.
	 */
	public NewsAPIFetchNewsResponse parseFetchNewsResponse(String fetchNewsResponseBody){
		NewsAPIFetchNewsResponse newsAPIFetchNewsResponse = null;
		try {
			newsAPIFetchNewsResponse = objectMapper.readValue(fetchNewsResponseBody, NewsAPIFetchNewsResponse.class);
		} catch (IOException exception) {
			newsAPILogAdder.addParsingExceptionErrorLog(exception.getMessage());
		}
		
		return newsAPIFetchNewsResponse;
	}
}
