package com.NewsBrowser.Server.Service.Interfaces;

/**
 * This interface represents service enabling getting news from news providers.
 * @author MJazy
 *
 */


public interface NewsFetcherInterface {

	
	/**
	 * Gets data from news provider.
	 * @param url represents relevant URL prepared service implementing URLPreparatorInterface. 
	 * @return relevant response body from news provider.
	 */
	String fetchNews(String url);
		
}
