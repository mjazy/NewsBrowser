package com.NewsBrowser.Server.Domain.NewsAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsAPIArticle {
	
	@JsonProperty
	private NewsAPISource source;
	
	@JsonProperty
	private String author;
	
	@JsonProperty
	private String title;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private String url;
	
	@JsonProperty
	private String urlToImage;
	
	@JsonProperty
	private String publishedAt;
	
	@JsonProperty
	private String content;
	
	public NewsAPIArticle(NewsAPISource source, String author, String title, String description, String url, 
			String urlToImage, String publishedAt, String content) {
		this.source = source;
		this.author = author;
		this.title = title;
		this.description = description;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.content = content;		
	}

	public NewsAPISource getSource() {
		return source;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getUrlToImage() {
		return urlToImage;
	}
	
	public String getPublishedAt() {
		return publishedAt;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		String string = String.format("source: '%s', author: '%s', title: '%s', description: '%s',"
				+ " url: '%s', urlToImage: '%s', publishedAt: '%s', content: '%s'",
				this.getSource(), this.getAuthor(), this.getTitle(), this.getDescription(),
				this.getUrl(), this.getUrlToImage(), this.getPublishedAt(), this.getContent());
		return string;
	}
	
}


