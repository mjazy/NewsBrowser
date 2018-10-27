package com.NewsBrowser.Server.Domain.NewsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data model representing response that may be returned from NewsAPI;
 * @author MJazy
 *
 */
public class NewsAPIFetchNewsResponse {
	@JsonProperty
	private String status;
	@JsonProperty
	private String totalResults;
	@JsonProperty
	private List<NewsAPIArticle> articles;
	
	public NewsAPIFetchNewsResponse(String status, String totalResults, List<NewsAPIArticle> articles) {
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getTotalResults() {
		return totalResults;
	}
	
	public List<NewsAPIArticle>getArticles() {
		return articles;
	}
	
	@Override
	public String toString() {
		String string = String.format("status: '%s', totalResults: '%s', articles: '%s'", this.getStatus(), this.getTotalResults(), this.getArticles());
		return string;
	}
}
