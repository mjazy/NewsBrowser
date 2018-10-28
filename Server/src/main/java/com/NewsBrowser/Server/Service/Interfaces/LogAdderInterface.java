package com.NewsBrowser.Server.Service.Interfaces;

import org.springframework.http.ResponseEntity;

/**
 * Represents service facilitating testing of log addition.
 * @author MJazy
 *
 */

public interface LogAdderInterface {

	/**
	 * Used to add log in case possible to predict HTTP status other than 'OK' occurred.
	 * @param responseEntity represents response from remote API.
	 */
	void addUnsuccessfulRequestDebugLog(ResponseEntity<String> responseEntity);

	/**
	 * Used to add log in case other than predicted HTTP status occurred.
	 * @param responseEntity represents response from remote API.
	 */
	void addUnsuccessfulRequestErrorLog(ResponseEntity<String> responseEntity);
	
	/**
	 * Used to log in exception's message related to parsing service.
	 * @param exceptionMessage represents value of e.g. getMessage() related to Throwable class.
	 */
	void addParsingExceptionErrorLog(String exceptionMessage);

}
