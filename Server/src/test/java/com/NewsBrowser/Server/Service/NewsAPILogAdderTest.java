package com.NewsBrowser.Server.Service;

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


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAPILogAdderTest {

	@Inject
	NewsAPILogAdder newsAPILogAdder;
	
	
    @Rule
    public final OutputCapture outputCapture = new OutputCapture();
	
	
	@Test
	public void errorLoggingTest() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("test", HttpStatus.BAD_REQUEST);
		newsAPILogAdder.addErrorLog(responseEntity);		
		outputCapture.expect(containsString("400 test"));
	}
	
	@Test
	public void debutLoggingTest() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("test", HttpStatus.TOO_MANY_REQUESTS);
		newsAPILogAdder.addErrorLog(responseEntity);		
		outputCapture.expect(containsString("429 test"));		
	}

}
