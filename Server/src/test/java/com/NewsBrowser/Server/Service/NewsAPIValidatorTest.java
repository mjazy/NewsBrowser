package com.NewsBrowser.Server.Service;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAPIValidatorTest {

	@Inject
	NewsAPIValidator newsAPIValidator;
	
	@Test
	public void validUserInputTest() {
		assertEquals(true, newsAPIValidator.isInputValid("pl", "business"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "entertainment"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "general"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "health"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "science"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "sports"));
		assertEquals(true, newsAPIValidator.isInputValid("pl", "technology"));
	}
	
	@Test
	public void invalidUserInputTest() {
		assertEquals(false, newsAPIValidator.isInputValid(null, null));
		assertEquals(false, newsAPIValidator.isInputValid("", ""));
		assertEquals(false, newsAPIValidator.isInputValid("de", "sports"));
		assertEquals(false, newsAPIValidator.isInputValid("pl", "everything"));
	}
	

}
