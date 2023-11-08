package com.hcg.spring.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	/*
	 * 
	 * GETMAPPING NORMAL SIN DATOS QUE PASAR
	 * 
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	*
	*
	*
	
	GETMAPING CON ERQUEST PARAM Y DEFAULT VALUES
	
	@GetMapping("/")
	public String welcome(@RequestParam(name="name", required= false, defaultValue="Mundo") String name, Model model) {
		//model.addAttribute("mensaje", "hola a todos");
		model.addAttribute("nombre", name);
		return "index";
	}
	*
	*
	*
	*/
	
	@GetMapping("/")
	public String welcome(@RequestParam("name") Optional<String> name, Model model) {
		model.addAttribute("nombre", name.orElse("Mundo"));
		return "index";
	}
	
	
	@GetMapping("/saludo/{name}")
	public String saludo(@PathVariable String name, Model model) {
		model.addAttribute("saludo", "Hola " + name);

		return "saludo";
	}
}
