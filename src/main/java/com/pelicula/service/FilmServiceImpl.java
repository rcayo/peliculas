package com.pelicula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.pelicula.model.Film;
import com.pelicula.model.FilmResponse;

@Service
public class FilmServiceImpl implements FilmService{
	
	
	private MultiValueMap<String, String> headers;
	
	private RestTemplate restTemplate;
	
	@Autowired
	public FilmServiceImpl(RestTemplate restTemplate) {
		
		headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/json");
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Film> getAll() {
		ResponseEntity<FilmResponse> response = restTemplate.getForEntity("https://swapi.dev/api/films", FilmResponse.class);
		
		return response.getBody().getResults();
	}
	
	

}
