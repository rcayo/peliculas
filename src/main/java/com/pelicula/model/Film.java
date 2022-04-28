package com.pelicula.model;

import java.io.Serializable;

public class Film implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	
	private String opening_crawl;
	
	private String url;

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
