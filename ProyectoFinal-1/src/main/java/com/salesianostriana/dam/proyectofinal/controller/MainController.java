package com.salesianostriana.dam.proyectofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectofinal.service.JugadorService;
import com.salesianostriana.dam.proyectofinal.service.MonitorService;

@Controller
public class MainController {

	@Autowired
	private MonitorService monitorService;
	
	@Autowired
	private JugadorService jugadorService;
	
	@GetMapping("/")
	public String index(@RequestParam(name="idMonitor", required=false)Long idMonitor, Model model) {
		model.addAttribute("monitor", monitorService.findAll());
		return "index";
	}
}
