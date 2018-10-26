package com.NewsBrowser.Server.Service.NewsAPI;

import com.NewsBrowser.Server.Service.Interfaces.URLPreparatorInterface;

public class NewsAPIURLPreparator implements URLPreparatorInterface{
	
	private final String APIKEY;
	
	public NewsAPIURLPreparator(String APIKEY){
		this.APIKEY = APIKEY;
	};
	
	/**
	 * @param country should be supplied in ISO 3166-1 code e.g. "pl".
	 * @param category should be one of "business, entertainment, general, health, science, sports, technology".
	 */
	@Override
	public String prepareFetchNewsUrl(String country, String category) {
		String url;
		url = String.format("https://newsapi.org/v2/top-headlines?country=%s&category=%s&apiKey=%s", country, category, this.APIKEY);
		return url;
	}

}
