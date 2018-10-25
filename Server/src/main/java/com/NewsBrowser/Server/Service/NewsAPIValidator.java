package com.NewsBrowser.Server.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NewsAPIValidator implements ValidatorInterface{

	private final Set<String> supportedCountries = new HashSet<>(Arrays.asList("pl"));
	private final Set<String> supportedCategories = new HashSet<>(Arrays.asList("business", "entertainment", "general", "health", "science", "sports", "technology")); 
	
	private boolean isCountryValid(String country) {
		if (supportedCountries.contains(country) == true){
			return true;			
		}
		else {
			return false;
		}
	}

	private boolean isCategoryValid(String category) {
		if (supportedCategories.contains(category) == true){
			return true;			
		}
		else {
			return false;
		}
	}

	/**
	 * @param country should be lower case ISO 3166-1 code. At this moment only "pl" is supported by this application.
	 * @param category should be one of "business, entertainment, general, health, science, sports, technology".
	 */
	@Override
	public boolean isInputValid(String country, String category) {
		if ((isCountryValid(country) == true) && (isCategoryValid(category) == true)) {
			return true;
		}
		else {
		return false;			
		}
	}

}
