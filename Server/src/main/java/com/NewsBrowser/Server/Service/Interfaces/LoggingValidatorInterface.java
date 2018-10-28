package com.NewsBrowser.Server.Service.Interfaces;

import org.springframework.http.ResponseEntity;

/**
 * Represents service facilitating testable determining if logs of particular level should be added.
 * Logging exceptions shouldn't be validated.
 * @author MJazy
 *
 */
public interface LoggingValidatorInterface {

	/**
	 * @param responseEntity with response from Remote API.
	 * @return true in case responseEntity's status code is different than 'OK' but classified as not a vendor error and is possible to occur e.g. 'TOO_MANY_REQUESTS'.
	 */
	boolean shouldUnsuccessfulRequestDebugLogBeAdded(ResponseEntity<String> responseEntity);

	/**
	 * @param responseEntity with response from Remote API.
	 * @return true in case responseEntity's status code is different than 'OK' and can be classified as vendor error or other not foreseen error.
	 */
	boolean shouldUnsuccessfulRequestErrorLogBeAdded(ResponseEntity<String> responseEntity);
	

	
}
