package com.NewsBrowser.Server.Service.NewsAPI;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPILoggingValidator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAPILoggingValidatorTest {

	@Inject
	NewsAPILoggingValidator newsAPILoggingValidator;

	ResponseEntity<String> tooManyRequestsResponseEntity; 
	ResponseEntity<String> okResponseEntity;
	ResponseEntity<String> badRequestResponseEntity;
	
	@Before
	public void initializeVariables() {
		tooManyRequestsResponseEntity = new ResponseEntity<>("Test", HttpStatus.TOO_MANY_REQUESTS); 
		okResponseEntity = new ResponseEntity<>("Test", HttpStatus.OK);
		badRequestResponseEntity = new ResponseEntity<>("Test", HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	@Test
	public void shouldUnsuccessfulRequestDebugLogBeAddedTest() {
		assertEquals(true, newsAPILoggingValidator.shouldUnsuccessfulRequestDebugLogBeAdded(tooManyRequestsResponseEntity));
		assertEquals(false, newsAPILoggingValidator.shouldUnsuccessfulRequestDebugLogBeAdded(okResponseEntity));
		assertEquals(false, newsAPILoggingValidator.shouldUnsuccessfulRequestDebugLogBeAdded(badRequestResponseEntity));

	}
	
	@Test
	public void shouldUnsuccessfulRequestErrorLogBeAddedTest() {
		assertEquals(false, newsAPILoggingValidator.shouldUnsuccessfulRequestErrorLogBeAdded(tooManyRequestsResponseEntity));
		assertEquals(false, newsAPILoggingValidator.shouldUnsuccessfulRequestErrorLogBeAdded(okResponseEntity));
		assertEquals(true, newsAPILoggingValidator.shouldUnsuccessfulRequestErrorLogBeAdded(badRequestResponseEntity));
	}

	

}
