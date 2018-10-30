package com.NewsBrowser.Server.Domain;

import java.util.List;
import java.util.stream.Collectors;

import com.NewsBrowser.Server.Domain.NewsAPI.NewsAPIArticle;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data model representing news's data model related to requirements.
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
	public News(String country, String category, List<NewsAPIArticle> articles) {
		this.country = country;
		this.category = category;
		this.articles = articles.stream().map(article -> new RequirementsCompliantArticle(article)).collect(Collectors.toList());
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
