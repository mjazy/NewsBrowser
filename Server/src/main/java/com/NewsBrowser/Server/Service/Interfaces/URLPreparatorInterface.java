package com.NewsBrowser.Server.Service.Interfaces;

/**
 * Interface represents service preparing URL to use by fetching class.
 * @author MJazy
 *
 */
public interface URLPreparatorInterface {

	/**
	 * Prepares URL relevant to fetching news from particular provider.
	 * @param country represents country to which news should be related (e.g. Poland).
	 * @param category represents category to which news should be related (e.g. Technology).
	 * @return URL.
	 */
	String prepareFetchNewsUrl(String country, String category);
	
	
}
