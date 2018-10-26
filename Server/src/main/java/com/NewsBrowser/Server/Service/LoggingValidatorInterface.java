package com.NewsBrowser.Server.Service;

import org.springframework.http.ResponseEntity;

/**
 * Represents service facilitating testable determining if logs of particular level should be added.
 * @author MJazy
 *
 */
public interface LoggingValidatorInterface {

	/**
	 * @param responseEntity with response from Remote API.
	 * @return true in case responseEntity's status code is different than 'OK' but classified as not a vendor error and is possible to occur e.g. 'TOO_MANY_REQUESTS'.
	 */
	boolean shouldDebugLogBeAdded(ResponseEntity<String> responseEntity);

	/**
	 * @param responseEntity with response from Remote API.
	 * @return true in case responseEntity's status code is different than 'OK' and can be classified as vendor error or other not foreseen error.
	 */
	boolean shouldErrorLogBeAdded(ResponseEntity<String> responseEntity);
	

	
}
