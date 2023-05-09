package com.salesianostriana.dam.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinal.model.Jugador;
import com.salesianostriana.dam.proyectofinal.repos.JugadorRepository;

@Service
public class JugadorService {
	
	private JugadorRepository jugadorRepository;
	
	public JugadorService(JugadorRepository repo) {
		this.jugadorRepository = repo;
	}
	
	//Añadir jugador
	public Jugador add(Jugador j) {
		return jugadorRepository.save(j);
	}
	
	//Editar un jugador, si no existe, añade uno
	public Jugador edit(Jugador j) {
		return jugadorRepository.save(j);
	}
	
	//Eliminar un jugador
	public void delete(Jugador j){
		jugadorRepository.delete(j);
	}

	//Eliminar un jugador por su id
	public void deleteById(long id) {
		jugadorRepository.deleteById(id);
	}
	
	//Devuelve todos los jugadores
	public List<Jugador> findAll(){
		return jugadorRepository.findAll();
	}
	
	//Devuelve un jugador, buscando por su id
	public Jugador findById(long id) {
		return jugadorRepository.findById(id).orElse(null);
	}
	
	
	
	
}
