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
	void addDebugLog(ResponseEntity<String> responseEntity);

	/**
	 * Used to add log in case other than predicted HTTP status occurred.
	 * @param responseEntity represents response from remote API.
	 */
	void addErrorLog(ResponseEntity<String> responseEntity);

}
