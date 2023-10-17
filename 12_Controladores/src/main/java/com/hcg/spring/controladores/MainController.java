package com.hcg.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	*/
	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("mensaje", "hola a todos");
		return "index";
	}
	
	@GetMapping("/saludo")
	public String saludo(Model model) {
		model.addAttribute("saludo", "Saludo a todos");

		return "saludo";
	}
}
