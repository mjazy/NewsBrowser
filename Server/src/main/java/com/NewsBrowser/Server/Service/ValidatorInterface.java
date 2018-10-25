package com.NewsBrowser.Server.Service;


/**
 * Represents validation of user input.
 * @author MJazy
 *
 */
public interface ValidatorInterface {
	
	/**
	 * Validates user input.
	 * @param country represents country to which news should be related (e.g. Poland).
	 * @param category represents category to which news should be related (e.g. Technology). 
	 * @return true if input is relevant, false in other scenario.
	 */
	boolean isInputValid(String country, String category);

}
