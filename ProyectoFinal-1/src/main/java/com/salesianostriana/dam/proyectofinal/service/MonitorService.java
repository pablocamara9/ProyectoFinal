package com.salesianostriana.dam.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinal.model.Monitor;
import com.salesianostriana.dam.proyectofinal.repos.MonitorRepository;

@Service
public class MonitorService {

	private MonitorRepository monitorRepository;
	
	public MonitorService(MonitorRepository repo) {
		this.monitorRepository = repo;
	}
	
	//Añadir monitor
	public Monitor add(Monitor m) {
		return monitorRepository.save(m);
	}
	
	//Editar un monitor, si no existe, añade uno
	public Monitor edit(Monitor m) {
		return monitorRepository.save(m);
	}
	
	//Eliminar un monitor
	public void delete(Monitor m) {
		monitorRepository.delete(m);
	}
	
	//Eliminar un monitor por su id
	public void deleteById(long id) {
		monitorRepository.deleteById(id);
	}
	
	//Devuelve todos los monitores
	public List<Monitor> findAll(){
		return monitorRepository.findAll();
	}
	
	//Devuelve un monitor, buscando por id
	public Monitor findById(long id) {
		return monitorRepository.findById(id).orElse(null);
	}
	
	

}