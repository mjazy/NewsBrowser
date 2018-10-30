package com.NewsBrowser.Server.Domain.NewsAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data model representing source object's structure that may be included in response from NewsAPI.
 * @author MJazy
 *
 */
public class NewsAPISource {
	
	@JsonProperty
	private String id;

	@JsonProperty
	private String name;

	public NewsAPISource() {
	}
	
	public NewsAPISource(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString(){
		String string = String.format("id: '%s', name: '%s'", this.getId(), this.getName());
		return string;
	}
}
