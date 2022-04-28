package com.pelicula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pelicula.model.Film;
import com.pelicula.service.FilmService;


@Controller
public class HomeController {

	@Autowired
	private FilmService filmService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
	}
	

    @GetMapping("/")
    public String main(Model model) {
    	List<Film> list = filmService.getAll();
    	
        model.addAttribute("listaPeliculas", list);
        return "home"; 
    }
	
    @PostMapping(value="/detail")
    public String consultarDetalle(  @ModelAttribute("objeto") String film) {
    	System.out.println("URL SELECCIONADO=>"+film.toString());

    	return "detail";
    }
	
}