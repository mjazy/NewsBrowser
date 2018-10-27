package com.NewsBrowser.Server.Domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data model for news to be browsed by client.
 * @author MJazy
 *
 */
public class News {

	@JsonProperty
	private String country;
	
	@JsonProperty
	private String category;

	@JsonProperty
	private List<RequirementsCompliantArticle> articles;
	
	/**
	 * @param country represents user input's country parameter.
	 * @param category represents user input's category parameter.
	 * @param articles represents articles in form compliant with requirements.
	 */
	public News(String country, String category, List<RequirementsCompliantArticle> articles) {
		this.country = country;
		this.category = category;
		this.articles = articles;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCategory() {
		return category;
	}
	
	public List<RequirementsCompliantArticle> getArticles(){
		return articles;
	}
	
	@Override
	public String toString() {
		String string = String.format("country: '%s', category: '%s', articles: '%s'", country, category, articles.toString());
		return string;
	}

}
