package com.NewsBrowser.Server.Service;

/**
 * This interface represents service enabling getting news from news providers.
 * @author MJazy
 *
 */


public interface NewsFetcherInterface {

	
	/**
	 * Gets data from news provider.
	 * @param country represents country to which news should be related (e.g. Poland).
	 * @param category represents category to which news should be related (e.g. Technology). 
	 * @return relevant response body from news provider.
	 */
	String fetchNews(String country, String category);
		
}
