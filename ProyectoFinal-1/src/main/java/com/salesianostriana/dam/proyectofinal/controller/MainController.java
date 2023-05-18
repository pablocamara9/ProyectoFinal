package com.salesianostriana.dam.proyectofinal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.proyectofinal.service.JugadorService;

@Controller
public class MainController {
	
	private JugadorService jugadorService;
	
	public MainController(JugadorService service) {
		this.jugadorService = service;
	}
	
	@GetMapping({"/", "portada.html"})
	public String index(Model model) {
		model.addAttribute("jugador", jugadorService.findAll());
		return "portada";
	}
	
	@GetMapping({"formularioRegistro.html", "registro"})
	public String formularioRegistro() {
		return "formularioRegistro";
	}
	
	@GetMapping({"formularioInicioSesion.html", "iniciarSesion", "iniciarsesion"})
	public String formularioInicioSesion() {
		return "formularioInicioSesion";
	}
}
