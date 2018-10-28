package com.NewsBrowser.Server.Service.NewsAPI;

import static org.hamcrest.CoreMatchers.containsString;
import javax.inject.Inject;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.NewsBrowser.Server.Service.NewsAPI.NewsAPILogAdder;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAPILogAdderTest {

	@Inject
	NewsAPILogAdder newsAPILogAdder;
	
	
    @Rule
    public final OutputCapture outputCapture = new OutputCapture();
    
 
	
	
	@Test
	public void addUnsuccessfulRequestErrorLogTest() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("test", HttpStatus.BAD_REQUEST);
		newsAPILogAdder.addUnsuccessfulRequestErrorLog(responseEntity);		
		outputCapture.expect(containsString("400 test"));
	}
	
	@Test
	public void addUnsuccessfulRequestDebugLogTest() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("test", HttpStatus.TOO_MANY_REQUESTS);
		newsAPILogAdder.addUnsuccessfulRequestErrorLog(responseEntity);		
		outputCapture.expect(containsString("429 test"));		
	}


	@Test
	public void addParsingExceptionErrorLogTest() {
		newsAPILogAdder.addParsingExceptionErrorLog("test");		
		outputCapture.expect(containsString("Parsing exception has occured: test"));
	}

	
}
